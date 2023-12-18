package com.np.iron.member.controller;

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

	}

	@Test
	public void testEntity() {

	}

	@Test
	public void testQuerydsl() {
		JPAQueryFactory queryFactory = new JPAQueryFactory(em);

	}
}
