package edu.mimo.InVinoVeritas.repository;

import edu.mimo.InVinoVeritas.model.Cepage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CepageRepository extends JpaRepository<Cepage, Integer> {

    @Query("SELECT c FROM Cepage c WHERE c.nom LIKE %:nom%")
    List<Cepage> findByNomContaining(@Param("nom") String nom);  // Méthode pour la recherche par nom
}
