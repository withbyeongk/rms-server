package com.np.iron.rms.member.controller;

import com.np.iron.rms.member.domain.Member;
import com.np.iron.rms.member.domain.MemberDTO;
import com.np.iron.rms.member.service.MemberService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@OpenAPIDefinition(info = @Info(title = "회원관련 요청 API", description = "회원관련 요청 API", version = "v1"))
@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;


	@Operation(summary = "회원가입 요청", description = "회원가입 가능", tags = {"addMember"})
	@ApiResponses({
			@ApiResponse(responseCode = "200", description = "SUCCESS"),
			@ApiResponse(responseCode = "501", description = "API EXCEPTION")
	})
	@RequestMapping("/add")
	public String addUser(@Valid @ModelAttribute("member") MemberDTO memberDTO, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "error";
		}

		// add Member
		Member newMember = memberDTO.toEntity();

		memberService.addMember(newMember);

		return "OK";
	}


}
