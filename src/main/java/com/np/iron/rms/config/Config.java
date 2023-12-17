package com.np.iron.rms.config;

import com.np.iron.rms.member.repository.MemberMybatisRepository;
import com.np.iron.rms.member.repository.MemberRepository;
import com.np.iron.rms.member.service.MemberService;
import com.np.iron.rms.member.service.MemberServiceImpl;

public class Config {

    public MemberService getMemberService() {
        return MemberServiceImpl(getMemberRepository());
    }

    public MemberRepository getMemberRepository() {
        return MemberMybatisRepository();
    }
}
