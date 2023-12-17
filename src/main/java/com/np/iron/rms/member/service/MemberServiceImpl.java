package com.np.iron.rms.member.service;

import com.np.iron.rms.member.domain.MemberDTO;
import com.np.iron.rms.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl {

	private final MemberRepository memberRepository;

	public void addMember(MemberDTO memberDTO) {

	}


}
