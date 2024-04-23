package org.xproce.produitexample.dao.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.produitexample.dao.entities.Produit;

@Transactional
public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    Page<Produit> findByDesignationContains(String keyword, Pageable pageable);
}