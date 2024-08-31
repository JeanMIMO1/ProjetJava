package edu.mimo.InVinoVeritas.service;

import edu.mimo.InVinoVeritas.model.Cepage;

import java.util.List;
import java.util.Optional;

public interface CepageService {
    List<Cepage> allCepages();
    Cepage enregistreCepage(Cepage cepage);
    Optional<Cepage> rechercheCepageParId(Integer id);
    List<Cepage> rechercheCepagesParNom(String nom);  // Déclaration de la méthode pour rechercher par nom
    void supressionCepageParId(Integer id);
}
