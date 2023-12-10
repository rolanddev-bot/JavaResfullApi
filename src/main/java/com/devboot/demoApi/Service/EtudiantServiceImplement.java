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
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> lire() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant modifier(Long id, Etudiant etudiant) {
      return etudiantRepository.findById(id).map(
                p-> {
                    p.setAge(etudiant.getAge());
                    p.setNom(etudiant.getNom());
                    p.setPrenom(etudiant.getPrenom());
                  return   etudiantRepository.save(p);
                }).orElseThrow(()-> new RuntimeException("ddddddd"));

    }

    @Override
    public String  supprimer(Long id) {
         etudiantRepository.deleteById(id);
         return "suppression effectué avec succès!";
    }
}
