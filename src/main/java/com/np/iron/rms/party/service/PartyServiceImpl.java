package com.np.iron.rms.party.service;

import com.np.iron.rms.party.repository.PartyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PartyServiceImpl {

	private final PartyRepository partyRepository;


}
