package com.np.iron.rms.user.controller;

import com.np.iron.rms.user.domain.UserDTO;
import com.np.iron.rms.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@RequestMapping("/add")
	public String addUser(@Valid @ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "error";
		}

		// add User


		return "OK";
	}


}
