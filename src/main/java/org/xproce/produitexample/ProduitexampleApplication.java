package org.xproce.produitexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.xproce.produitexample.dao.entities.Produit;
import org.xproce.produitexample.dao.repositories.ProduitRepository;
import org.xproce.produitexample.metier.ProduitManager;

import java.util.List;

@SpringBootApplication
public class ProduitexampleApplication implements CommandLineRunner {

   /* @Autowired
    ProduitManager produitManager;*/

    public static void main(String[] args) {
        SpringApplication.run(ProduitexampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /* Produit produit0 = new Produit(null, "msi","msi i9 17", 2500.0);
        Produit produit1 = new Produit(null, "hp","hp vpro 14", 2000.0);
        Produit produit2 = new Produit(null, "macbook pro","mac book pro m2 16gb 512", 3000.0);
        Produit produit3 = new Produit(null, "macbook air","mac book air m2 8gb 51", 2400.0);
        Produit produit4 = new Produit(null, "macbook m3","mac book pro m3 max  18gb 51", 4000.0);
        produitManager.addProduit(produit0);
        produitManager.addProduit(produit1);
        produitManager.addProduit(produit2);
        produitManager.addProduit(produit3);
        produitManager.addProduit(produit4);
*/
    }
}