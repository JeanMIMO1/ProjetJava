package edu.mimo.InVinoVeritas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cepage")
public class Cepage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "couleur")
    private String couleur;

    @Column(name = "caracteristiques_gustatives")
    private String caracteristiquesGustatives;

    @Column(name = "region_origine")
    private String regionOrigine;

    @Column(name = "taux_sucre")
    private Double tauxSucre;

    @Column(name = "acidite")
    private Double acidite;

    @Column(name = "potentiel_garde")
    private Integer potentielGarde;

    @Column(name = "rendement")
    private Double rendement;

    @Column(name = "temperature_optimale")
    private Double temperatureOptimale;

    @Column(name = "resistance_maladies")
    private String resistanceMaladies;

    @Column(name = "aromes_typiques")
    private String aromesTypiques;

    @Column(name = "alcool_potentiel")
    private Double alcoolPotentiel;

    @Column(name = "descriptif")
    private String description;

    // Getters and Setters
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

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getCaracteristiquesGustatives() {
        return caracteristiquesGustatives;
    }

    public void setCaracteristiquesGustatives(String caracteristiquesGustatives) {
        this.caracteristiquesGustatives = caracteristiquesGustatives;
    }

    public String getRegionOrigine() {
        return regionOrigine;
    }

    public void setRegionOrigine(String regionOrigine) {
        this.regionOrigine = regionOrigine;
    }

    public Double getTauxSucre() {
        return tauxSucre;
    }

    public void setTauxSucre(Double tauxSucre) {
        this.tauxSucre = tauxSucre;
    }

    public Double getAcidite() {
        return acidite;
    }

    public void setAcidite(Double acidite) {
        this.acidite = acidite;
    }

    public Integer getPotentielGarde() {
        return potentielGarde;
    }

    public void setPotentielGarde(Integer potentielGarde) {
        this.potentielGarde = potentielGarde;
    }

    public Double getRendement() {
        return rendement;
    }

    public void setRendement(Double rendement) {
        this.rendement = rendement;
    }

    public Double getTemperatureOptimale() {
        return temperatureOptimale;
    }

    public void setTemperatureOptimale(Double temperatureOptimale) {
        this.temperatureOptimale = temperatureOptimale;
    }

    public String getResistanceMaladies() {
        return resistanceMaladies;
    }

    public void setResistanceMaladies(String resistanceMaladies) {
        this.resistanceMaladies = resistanceMaladies;
    }

    public String getAromesTypiques() {
        return aromesTypiques;
    }

    public void setAromesTypiques(String aromesTypiques) {
        this.aromesTypiques = aromesTypiques;
    }

    public Double getAlcoolPotentiel() {
        return alcoolPotentiel;
    }

    public void setAlcoolPotentiel(Double alcoolPotentiel) {
        this.alcoolPotentiel = alcoolPotentiel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
