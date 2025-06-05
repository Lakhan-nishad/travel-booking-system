package com.lakhan.travel.user_service.service;

import com.lakhan.travel.user_service.dto.UserDTO;

import java.util.List;

/**
 * @author Lakhan Nishad
 */
public interface IUserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUsers();
    void deleteUser(Long id);
}
