package com.np.iron.rms.slot.repository;

import com.np.iron.rms.slot.domain.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends JpaRepository<Slot, Long> {
}