package edu.mimo.InVinoVeritas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import edu.mimo.InVinoVeritas.model.Appelation;

public interface AppelationRepository extends JpaRepository<Appelation, Integer> {

    @Query("SELECT a FROM Appelation a WHERE a.nom LIKE %:nom%")
    List<Appelation> rechercheAppelationParNom(@Param("nom") String nom);

}
