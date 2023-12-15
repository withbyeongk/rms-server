package com.np.iron.rms.user.repository;

import com.np.iron.rms.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
