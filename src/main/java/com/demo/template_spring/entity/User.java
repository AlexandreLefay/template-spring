package com.demo.template_spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements UserDetails {

    /**
     * ID of the user
     *
     * @GeneratedValue(strategy = GenerationType.IDENTITY) indicates that the ID will be generated automatically
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Mail of the user
     */
    private String email;

    /**
     * Password of the user
     */
    private String password;

    /**
     * Enabled status of the user
     */
    private boolean enabled = true;

    /**
     * Role of the user
     *
     * @ManyToOne indicates that many users can be associated with one role
     * @JoinColumn(name = "role_id") specifies the foreign key column in the users table
     */
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    /**
     * Tasks associated with the user
     *
     * @OneToMany indicates that one user can be associated with many tasks
     * CascadeType.ALL indicates that all operations (persist, remove, etc.) will be cascaded to the tasks
     * that means if the user is deleted, all associated tasks will be deleted as well
     * @JoinColumn(name = "user_id") specifies the foreign key column in the tasks table
     */
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks = new ArrayList<>();

    /**
     * Get the authorities of the user
     */
    @Override public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.getName()));
    }

    @Override public String getUsername() { return email; }
    @Override public boolean isAccountNonExpired() { return true; }
    @Override public boolean isAccountNonLocked() { return true; }
    @Override public boolean isCredentialsNonExpired() { return true; }
}
