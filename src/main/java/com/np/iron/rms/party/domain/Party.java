package com.np.iron.rms.party.domain;

import com.np.iron.rms.channel.domain.Channel;
import com.np.iron.rms.user.domain.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "TB_PARTY")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Party {

	@Id
	@GeneratedValue
	@Column(name = "party_id")
	private Long partyId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "channel_id")
	private Channel channel;

	@Column(name = "created_time")
	private LocalDateTime createdTime;

}
