package com.devboot.demoApi.Service;

import com.devboot.demoApi.Model.Etudiant;

import java.util.List;

public interface EtudiantService {

    Etudiant creer(Etudiant etudiant);

    List<Etudiant> lire();

    Etudiant modifier(Long id, Etudiant etudiant);

    String  supprimer(Long id);
}
