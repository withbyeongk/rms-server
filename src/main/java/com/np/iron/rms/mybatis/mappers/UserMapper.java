package com.np.iron.rms.mybatis.mappers;

import com.np.iron.rms.user.domain.User;
import com.np.iron.rms.user.domain.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

	public List<User> finaAll();

	public User findById(Long userId);

	public User addUser(UserDTO userDTO);

	public User editUser(UserDTO userDTO);

	User login(@Param("phone") String phone
			 , @Param("password") String password);

}
