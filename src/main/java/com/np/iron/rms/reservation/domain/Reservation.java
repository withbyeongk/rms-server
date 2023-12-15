package com.np.iron.rms.reservation.domain;

import com.np.iron.rms.slot.domain.Slot;
import com.np.iron.rms.user.domain.User;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Reservation {

	@Id
	@GeneratedValue
	@Column(name = "reservation_id")
	private Long reservationId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "slot")
	private Slot slot;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user")
	private User user;

	@Column(name = "created_time")
	private LocalDateTime createdTime;
}
