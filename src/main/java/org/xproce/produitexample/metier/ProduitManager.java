package org.xproce.produitexample.metier;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.xproce.produitexample.dao.entities.Produit;

import java.util.List;

@Component
public interface ProduitManager {
    public Produit addProduit(Produit produit);
    public Page<Produit> getAllProduits(int page, int taille);
    public Page<Produit> searchProduits(String keyword, int page, int taille);
    public List<Produit> getByKeyword(String keyword);
    public Produit getProduitById(Integer id);
    public Produit updateProduit(Produit produit);
    public boolean deleteProduit(Integer id);
}
