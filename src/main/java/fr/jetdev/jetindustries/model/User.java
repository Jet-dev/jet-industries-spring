package fr.jetdev.jetindustries.model;

import fr.jetdev.jetindustries.enums.UserRole;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "space_user")
@Data
public class User {

    @Id
    @GeneratedValue
    @Column(updatable = false, nullable = false)
    private UUID userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column
    @Enumerated(value = EnumType.STRING)
    private UserRole role;
}
