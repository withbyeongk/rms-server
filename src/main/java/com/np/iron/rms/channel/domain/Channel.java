package com.np.iron.rms.channel.domain;

import com.np.iron.rms.activity.domain.Activity;
import com.np.iron.rms.party.domain.Party;
import com.np.iron.rms.user.domain.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_CHANNEL")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Channel {

	@Id
	@GeneratedValue
	@Column(name = "channel_id")
	private Long channelId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "channel_name")
	private String channelName;

	@Column(name = "contents")
	private String contents;

	@OneToMany(mappedBy = "channel")
	List<Party> parties = new ArrayList<>();

	@OneToMany(mappedBy = "activity")
	List<Activity> activities = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@Enumerated
	@Column(name = "approval_state")
	private ApprovalState approvalState;    // WAITING, APPROVED, DECLIEND, HOLD

	@Column(name = "created_time")
	private LocalDateTime createdTime;
}
