package com.demo.template_spring.dto.user;

import lombok.Data;

/**
 * DTO for user response
 * The response will be used to send data from the server to the client
 *
 * @data is a Lombok annotation that generates getters, setters, equals, hashCode, and toString methods
 * It will import all method automatically, it's better to import only the ones you need
 */
@Data
public class UserResponse {

    /**
     * The ID of the user
     */
    private Long id;

    /**
     * The email of the user
     */
    private String email;

    /**
     * The role of the user
     */
    private String roleName;
}