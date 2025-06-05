package com.lakhan.travel.user_service.controller;

import com.lakhan.travel.user_service.dto.UserDTO;
import com.lakhan.travel.user_service.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/user")
@RestController
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @PostMapping
    ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.createUser(userDTO));
    }

    @GetMapping("/{id}")
    ResponseEntity<UserDTO> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @GetMapping
    ResponseEntity<List<UserDTO>> getAllUser() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
    @DeleteMapping("/{id}")
    ResponseEntity<String> deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);
        return ResponseEntity.ok("User Delete Successfully");
    }


}
