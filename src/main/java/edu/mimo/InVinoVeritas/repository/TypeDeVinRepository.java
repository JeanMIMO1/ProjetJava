package edu.mimo.InVinoVeritas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.mimo.InVinoVeritas.model.TypeDeVin;
import java.util.List;

@Repository
public interface TypeDeVinRepository extends JpaRepository<TypeDeVin, Integer> {
    List<TypeDeVin> findByNom(String nom);
}
