package com.np.iron.rms.reservation.repository;

import com.np.iron.rms.reservation.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
