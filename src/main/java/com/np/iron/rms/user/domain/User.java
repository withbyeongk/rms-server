package com.np.iron.rms.user.domain;

import com.np.iron.rms.party.domain.Party;
import com.np.iron.rms.reservation.domain.Reservation;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_USER")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)	// 기본생성자는 막고 싶을 때, JPA 스펙상 PROTECTED는 열어둬야할 때 사용
@ToString(of = {"userId", "userName", "phone", "userType", "createdTime"})
public class User {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "phone")
	private String phone;

	@Column(name = "password")
	private String password;

	@OneToMany(mappedBy = "user")
	List<Party> parties = new ArrayList<>();

	@OneToMany(mappedBy = "reservation")
	List<Reservation> reservations = new ArrayList<>();

	@Enumerated(EnumType.STRING)
	@Column(name = "user_type")
	private UserType userType;        // ADMIN(관리자), MASTER(채널주인), MEMBER(일반회원), BOTH(채널주인+일반회원)

	@Column(name = "created_time")
	private LocalDateTime createdTime;

}
