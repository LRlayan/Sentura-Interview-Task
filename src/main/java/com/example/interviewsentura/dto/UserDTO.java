package com.example.interviewsentura.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @NotBlank(message="UID is required")
    @Pattern(regexp = ".*\\D.*", message = "UID must contain at least one non-digit character")
    private String uid;
    @Size(max = 100, message = "cannot be input more than 50 characters")
    private String name;
    @Size(max = 50, message = "cannot be more than 50 characters")
    private String given_name;
    @Size(max = 50, message = "cannot be more than 50 characters")
    private String middle_name;
    @Size(max = 50, message = "cannot be input more than 50 characters")
    private String family_name;
    @Size(max = 50, message = "cannot be input more than 50 characters")
    private String nickname;
    @Email(message = "Invalid email format")
    private String email;
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Invalid phone number format")
    private String phone_number;
    @Size(max = 255, message = "cannot be input more than 255 characters")
    private String comment;
    private String picture;
    @Size(max = 150, message = "cannot be input more than characters")
    private String directory;
    private Map<String, Object> metadata;
    private List<String> tags;
}
