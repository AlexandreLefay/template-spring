package com.demo.template_spring.dto.user;

import lombok.Data;

/**
 * DTO for saving a user
 * The request will be used to send data from the client to the server
 *
 * @data is a Lombok annotation that generates getters, setters, equals, hashCode, and toString methods
 * It will import all method automatically, it's better to import only the ones you need
 */
@Data
public class UserSaveRequest {

    /**
     * The email of the user
     */
    private String email;

    /**
     * The password of the user
     */
    private String password;

    /**
     * The ID of the role of the user
     */
    private Long roleId;
}