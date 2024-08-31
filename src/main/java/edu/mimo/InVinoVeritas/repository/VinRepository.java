package edu.mimo.InVinoVeritas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.mimo.InVinoVeritas.model.Vin;
import java.util.List;

@Repository
public interface VinRepository extends JpaRepository<Vin, Integer> {
    List<Vin> findByNom(String nom);
}
