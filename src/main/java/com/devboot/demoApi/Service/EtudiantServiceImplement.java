package com.devboot.demoApi.Service;

import com.devboot.demoApi.Model.Etudiant;
import com.devboot.demoApi.Repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class EtudiantServiceImplement implements EtudiantService {

    private final EtudiantRepository etudiantRepository;
    @Override
    public Etudiant creer(Etudiant etudiant) {
        return null;
    }

    @Override
    public List<Etudiant> lire() {
        return null;
    }

    @Override
    public Etudiant modifier(Long id, Etudiant etudiant) {
        return null;
    }

    @Override
    public Etudiant supprimer(Long id) {
        return null;
    }
}
