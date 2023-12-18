package com.np.iron.rms.member.controller;

import com.np.iron.rms.member.domain.MemberDTO;
import com.np.iron.rms.member.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;

	@RequestMapping("/add")
	public String addUser(@Valid @ModelAttribute("member") MemberDTO memberDTO, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "error";
		}

		// add User


		return "OK";
	}


}
