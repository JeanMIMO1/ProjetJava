package edu.mimo.InVinoVeritas.service;

import edu.mimo.InVinoVeritas.model.Vin;
import java.util.List;
import java.util.Optional;

public interface VinService {
    List<Vin> allVins();
    Optional<Vin> rechercheVinParId(Integer id);
    List<Vin> rechercheVinsParNom(String nom);
    Vin enregistreVin(Vin vin);
    void supressionVinParId(Integer id);
}
