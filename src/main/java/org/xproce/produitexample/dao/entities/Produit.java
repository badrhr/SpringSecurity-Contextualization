package org.xproce.produitexample.dao.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Table(name = "produits")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty
    @Size(max = 100)
    private String title;
    @NotEmpty
    @Pattern(regexp = "[A-Za-z0-9 ]*")
    private String designation;
    @NotNull
    @Min(0)
    private double prix;
}