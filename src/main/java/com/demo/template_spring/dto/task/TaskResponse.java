package com.demo.template_spring.dto.task;

import lombok.Data;

/**
 * DTO for task response
 * The response will be used to send data from the server to the client
 *
 * @data is a Lombok annotation that generates getters, setters, equals, hashCode, and toString methods
 * It will import all method automatically, it's better to import only the ones you need
 */
@Data
public class TaskResponse {

    /**
     * The ID of the task
     */
    private Long id;

    /**
     * The title of the task
     */
    private String title;

    /**
     * Indicates if the task is done
     */
    private boolean done;

    /**
     * The ID of the user who created the task
     */
    private String userEmail;
}
