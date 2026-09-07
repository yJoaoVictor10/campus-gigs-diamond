package br.com.fiap.campusgigs.User;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    private String cep;

    @Pattern(regexp = "ADMIN|USER")
    private String role;
}
