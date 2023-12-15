package com.np.iron.rms.user.repository;

import com.np.iron.rms.user.domain.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class UserJpaRepository {

	@PersistenceContext
	private EntityManager em;

	public User save(User user) {
		em.persist(user);
		return user;
	}
}
