package com.np.iron.rms.member.domain;

import com.np.iron.rms.party.domain.Party;
import com.np.iron.rms.reservation.domain.Reservation;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_MEMBER")
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)	// 기본생성자는 막고 싶을 때, JPA 스펙상 PROTECTED는 열어둬야할 때 사용
@ToString(of = {"memberId", "memberName", "phone", "memberType", "createdTime"})
@EnableJpaAuditing
@EntityListeners(AuditingEntityListener.class)
public class Member {

	@Id
	@GeneratedValue
	@Column(name = "member_id")
	private Long memberId;

	@Column(name = "member_name")
	private String memberName;

	@Column(name = "phone")
	private String phone;

	@Column(name = "memberPw")
	private String memberPw;

	@OneToMany(mappedBy = "member")
	List<Party> parties = new ArrayList<>();

	@OneToMany(mappedBy = "member")
	List<Reservation> reservations = new ArrayList<>();

	@Enumerated(EnumType.STRING)
	@Column(name = "member_type")
	private MemberType memberType;        // ADMIN(관리자), MASTER(채널주인), MEMBER(일반회원), BOTH(채널주인+일반회원)

	@CreatedDate
	@Column(name = "created_time")
	private LocalDateTime createdTime;

}
