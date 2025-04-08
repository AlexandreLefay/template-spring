package com.demo.template_spring.dto.task;

import lombok.Data;

/**
 * DTO for saving a task
 * The request will be used to send data from the client to the server
 *
 * @data is a Lombok annotation that generates getters, setters, equals, hashCode, and toString methods
 * It will import all method automatically, it's better to import only the ones you need
 */
@Data
public class TaskSaveRequest {

    /**
     * The title of the task
     */
    private String title;

    /**
     * The description of the task
     */
    private boolean done;

    /**
     * The ID of the user who created the task
     */
    private Long userId;
}
