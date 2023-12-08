package com.devboot.demoApi.Repository;

import com.devboot.demoApi.Model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long > {

}
