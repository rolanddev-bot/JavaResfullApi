package com.devboot.demoApi.Service;

import com.devboot.demoApi.Model.Produit;

import java.util.List;

public interface ProduitService {


    Produit creer(Produit produit);

    List<Produit> lire();

    Produit modifier(Long id, Produit produit);

    //gestion de la suppression
    String supprimer(Long id);


}
