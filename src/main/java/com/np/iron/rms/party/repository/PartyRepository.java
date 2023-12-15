package com.np.iron.rms.party.repository;

import com.np.iron.rms.party.domain.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Long> {
}
