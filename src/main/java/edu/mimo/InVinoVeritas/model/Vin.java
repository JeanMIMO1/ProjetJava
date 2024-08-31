package edu.mimo.InVinoVeritas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vino")
public class Vin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "pays")
    private String pays;

    @ManyToOne
    @JoinColumn(name = "type_de_vin_id", referencedColumnName = "id")
    private TypeDeVin typeDeVin;

    @ManyToOne
    @JoinColumn(name = "appelation_id", referencedColumnName = "id")
    private Appelation appelation;

    @ManyToOne
    @JoinColumn(name = "domaine_exploitation_id", referencedColumnName = "id")
    private DomaineExploitation domaineExploitation;

    @ManyToOne
    @JoinColumn(name = "cepage_id", referencedColumnName = "id")
    private Cepage cepage;

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

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public TypeDeVin getTypeDeVin() {
        return typeDeVin;
    }

    public void setTypeDeVin(TypeDeVin typeDeVin) {
        this.typeDeVin = typeDeVin;
    }

    public Appelation getAppelation() {
        return appelation;
    }

    public void setAppelation(Appelation appelation) {
        this.appelation = appelation;
    }

    public DomaineExploitation getDomaineExploitation() {
        return domaineExploitation;
    }

    public void setDomaineExploitation(DomaineExploitation domaineExploitation) {
        this.domaineExploitation = domaineExploitation;
    }

    public Cepage getCepage() {
        return cepage;
    }

    public void setCepage(Cepage cepage) {
        this.cepage = cepage;
    }
}
