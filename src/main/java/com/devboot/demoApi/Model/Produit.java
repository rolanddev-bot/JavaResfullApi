package com.devboot.demoApi.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="PRODUIT")
@Data

@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String nom;
    @Column(length = 150)
    private  String description;
    private double prix;


}
