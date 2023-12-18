package com.np.iron.member.controller;

import com.np.iron.rms.member.domain.Member;
import com.np.iron.rms.constant.MemberType;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class MemberControllerTest {

	@PersistenceContext
	EntityManager em;

	@BeforeEach
	public void before() {
		Member member1 = new Member("이름1", "01011111111", "0001", MemberType.ADMIN);
		Member member2 = new Member("이름2", "01022222222", "0002", MemberType.MASTER);
		Member member3 = new Member("이름3", "01033333333", "0003", MemberType.BOTH);
		Member member4 = new Member("이름4", "01044444444", "0004", MemberType.MEMBER);

		em.persist(member1);
		em.persist(member2);
		em.persist(member3);
		em.persist(member4);

	}

	@Test
	public void saveMember() {

	}

	@Test
	public void testQuerydsl() {
		JPAQueryFactory queryFactory = new JPAQueryFactory(em);

	}
}
