package edu.mimo.InVinoVeritas.service;

import java.util.List;
import java.util.Optional;  

import org.springframework.stereotype.Service;

import edu.mimo.InVinoVeritas.model.TypeDeVin;

@Service
public interface TypeDeVinService {

    List<TypeDeVin> allTypeDeVins();

    Optional<TypeDeVin> rechercheTypeDeVinParId(Integer id);

    List<TypeDeVin> rechercheTypeDeVinsParNom(String name);

    TypeDeVin enregistreTypeDeVin(TypeDeVin TypeDeVin);

    void supressionTypeDeVinParId(Integer id);
}
