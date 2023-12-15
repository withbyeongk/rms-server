package com.np.iron.rms.activity.controller;

import com.np.iron.rms.activity.service.ActivityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ActivityController {

	private ActivityService activityService;


}
