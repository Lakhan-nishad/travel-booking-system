package com.lakhan.travel.user_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lakhan Nishad
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private Long id;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String age;
    private String gender;
    private String address;
    private String userName;
    private String role;

}
