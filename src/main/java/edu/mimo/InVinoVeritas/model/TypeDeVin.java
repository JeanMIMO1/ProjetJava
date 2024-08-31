package edu.mimo.InVinoVeritas.model;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "type_de_vin")
public class TypeDeVin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Correction ici
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "couleur")
    private String couleur;

    @Column(name = "millesime")
    private int millesime;

    @Column(name = "teneur_alcool")
    private double teneurAlcool;

    @ManyToOne
    @JoinColumn(name = "cepage_principal_id")
    private Cepage cepagePrincipal;

    @ElementCollection
    @Column(name = "aromes")
    private List<String> aromes;

    @Column(name = "duree_garde")
    private int dureeGarde;

    @Column(name = "temperature_service")
    private double temperatureService;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "domaine_origine_id")
    private DomaineExploitation domaineOrigine;

    @Column(name = "region_viticole")
    private String regionViticole;

    @Column(name = "prix_moyen")
    private double prixMoyen;

    @Column(name = "volume_production")
    private double volumeProduction;

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

    public int getMillesime() {
        return millesime;
    }

    public void setMillesime(int millesime) {
        this.millesime = millesime;
    }

    public double getTeneurAlcool() {
        return teneurAlcool;
    }

    public void setTeneurAlcool(double teneurAlcool) {
        this.teneurAlcool = teneurAlcool;
    }

    public Cepage getCepagePrincipal() {
        return cepagePrincipal;
    }

    public void setCepagePrincipal(Cepage cepagePrincipal) {
        this.cepagePrincipal = cepagePrincipal;
    }

    public List<String> getAromes() {
        return aromes;
    }

    public void setAromes(List<String> aromes) {
        this.aromes = aromes;
    }

    public int getDureeGarde() {
        return dureeGarde;
    }

    public void setDureeGarde(int dureeGarde) {
        this.dureeGarde = dureeGarde;
    }

    public double getTemperatureService() {
        return temperatureService;
    }

    public void setTemperatureService(double temperatureService) {
        this.temperatureService = temperatureService;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DomaineExploitation getDomaineOrigine() {
        return domaineOrigine;
    }

    public void setDomaineOrigine(DomaineExploitation domaineOrigine) {
        this.domaineOrigine = domaineOrigine;
    }

    public String getRegionViticole() {
        return regionViticole;
    }

    public void setRegionViticole(String regionViticole) {
        this.regionViticole = regionViticole;
    }

    public double getPrixMoyen() {
        return prixMoyen;
    }

    public void setPrixMoyen(double prixMoyen) {
        this.prixMoyen = prixMoyen;
    }

    public double getVolumeProduction() {
        return volumeProduction;
    }

    public void setVolumeProduction(double volumeProduction) {
        this.volumeProduction = volumeProduction;
    }
}
