package com.demo.template_spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {

    /**
     * ID of the task
     *
     * @GeneratedValue(strategy = GenerationType.IDENTITY) indicates that the ID will be generated automatically
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Title of the task
     */
    private String title;

    /**
     * Description of the task
     */
    private boolean done;

    /**
     * Id of the user who created the task
     *
     * @ManyToOne indicates that many tasks can be associated with one user
     * @JoinColumn(name = "user_id") specifies the foreign key column in the tasks table
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
