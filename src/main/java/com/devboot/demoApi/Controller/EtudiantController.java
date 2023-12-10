package com.devboot.demoApi.Controller;

import com.devboot.demoApi.Model.Etudiant;
import com.devboot.demoApi.Service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    private final EtudiantService etudiantService ;

    @PostMapping("/create")
    public Etudiant create(@RequestBody Etudiant etudiant){
        return etudiantService.creer(etudiant);
    }

    @PutMapping("/update/{id}")
    public Etudiant update(@PathVariable Long id ,@RequestBody Etudiant etudiant){
        return etudiantService.modifier(id,etudiant);
    }


    @GetMapping("/read")
    public List<Etudiant> read(){
        return etudiantService.lire();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return etudiantService.supprimer(id);
    }
}
