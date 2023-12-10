package com.devboot.demoApi.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="ETUDIANT")
@Data
@NoArgsConstructor
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 15)
    private String nom;
    @Column(length = 30)
    private String prenom;
    @Column(length = 3)
    private Integer age;

}
