package com.lakhan.travel.user_service.service.impl;

import com.lakhan.travel.user_service.dto.UserDTO;
import com.lakhan.travel.user_service.entity.User;
import com.lakhan.travel.user_service.repository.UserRepository;
import com.lakhan.travel.user_service.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Lakhan Nishad
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    /**
     * @param userDTO - user object
     * @return - user
     */
    @Override
    public UserDTO createUser(UserDTO userDTO) {
        if(userRepository.existsByUserName(userDTO.getUserName())) {
            throw new RuntimeException("User name already exists");
        }
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        user = userRepository.save(user);
        UserDTO userDTO1 = new UserDTO();
        BeanUtils.copyProperties(user, userDTO1);

        return userDTO1;
    }

    /**
     * @param id - user id
     * @return user
     */
    @Override
    public UserDTO getUserById(Long id) {

        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("user not find"));

        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);

        return userDTO;
    }

    /**
     * @return List of User
     */
    @Override
    public List<UserDTO> getAllUsers() {

        return userRepository.findAll().stream().map(user -> {
            UserDTO userDTO = new UserDTO();
            BeanUtils.copyProperties(user, userDTO);
            return userDTO;
        }).collect(Collectors.toList());

    }

    /**
     * @param id - user id
     */
    @Override
    public void deleteUser(Long id) {

        userRepository.deleteById(id);

    }
}
