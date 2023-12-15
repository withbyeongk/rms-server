package com.np.iron.rms.activity.repository;

import com.np.iron.rms.activity.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
