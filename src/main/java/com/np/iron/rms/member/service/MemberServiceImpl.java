package com.np.iron.rms.member.service;

import com.np.iron.rms.member.domain.Member;
import com.np.iron.rms.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

	private final MemberRepository memberRepository;

	public void addMember(Member member) {
		memberRepository.save(member);
	}


}
