package com.devboot.demoApi.Controller;


import com.devboot.demoApi.Model.Produit;
import com.devboot.demoApi.Service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {
    private final ProduitService produitService;


    //CREATION DUNE DONNE DANS LE CONTROLLER
    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){
        return produitService.creer(produit);
    }



    //LISTE DE TOUTES DONNES ENREGISTRER
    @GetMapping("/liste")
    public List<Produit> read(){
        return produitService.lire();
    }



    //MODIFICATION DUNE DONNE DE LA BASE DANS LE CONTROLLER
    @PutMapping("/update/{id}")
    public  Produit update( @PathVariable Long id, @RequestBody Produit produit){
        return produitService.modifier(id,produit);

    }


    // SUPPRESSION DUN ELEMENT DE LA BASE DE DONNE DANS LE CONTROLLER
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        return  produitService.supprimer(id);
    }

}
