package com.np.iron.rms.mybatis.mappers;

import com.np.iron.rms.member.domain.Member;
import com.np.iron.rms.member.domain.MemberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {

	public List<Member> finaAll();

	public Member findById(Long memberId);

	public Member addMember(MemberDTO memberDTO);

	public Member editMember(MemberDTO memberDTO);

	Member login(@Param("phone") String phone
			 , @Param("memberPw") String memberPw);

}
