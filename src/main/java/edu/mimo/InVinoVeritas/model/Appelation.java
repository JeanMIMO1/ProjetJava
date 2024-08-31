package edu.mimo.InVinoVeritas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "appelation")
public class Appelation {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;


    @Column(name = "nomAppelation")
    private String nom;

    @Column(name = "anneeCreation")
    private int anneeCreation;

    @Column(name = "lieu")
    private String lieu;  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnneeCreation() {
        return anneeCreation;
    }

    public void setAnneeCreation(int anneeCreation) {
        this.anneeCreation = anneeCreation;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

  

  

   
}
