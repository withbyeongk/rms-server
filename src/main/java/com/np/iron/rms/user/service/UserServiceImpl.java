package com.np.iron.rms.user.service;

import com.np.iron.rms.user.domain.UserDTO;
import com.np.iron.rms.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl {

	private final UserRepository userRepository;

	public void addUser(UserDTO userDTO) {

	}


}
