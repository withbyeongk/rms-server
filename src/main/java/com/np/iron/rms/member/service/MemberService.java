package com.np.iron.rms.member.service;

import com.np.iron.rms.member.domain.Member;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {

    void addMember(Member newMember);
}
