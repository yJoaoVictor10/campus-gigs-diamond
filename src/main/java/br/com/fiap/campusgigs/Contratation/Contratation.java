package br.com.fiap.campusgigs.Contratation;

import br.com.fiap.campusgigs.Service.Service;
import br.com.fiap.campusgigs.User.User;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Contratation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "contratante_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;

}
