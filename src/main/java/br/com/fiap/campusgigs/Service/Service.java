package br.com.fiap.campusgigs.Service;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String provider;
    private String title;
    private String description;
    private String category;
    private Double price;
}
