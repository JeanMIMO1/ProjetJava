package edu.mimo.InVinoVeritas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.mimo.InVinoVeritas.model.TypeDeVin;
import edu.mimo.InVinoVeritas.repository.TypeDeVinRepository;
import java.util.List;
import java.util.Optional;

@Service
public class TypeDeVinServiceImpl implements TypeDeVinService {

    @Autowired
    private TypeDeVinRepository typeDeVinRepository;

    @Override
    public List<TypeDeVin> allTypeDeVins() {
        return typeDeVinRepository.findAll();
    }

    @Override
    public Optional<TypeDeVin> rechercheTypeDeVinParId(Integer id) {
        return typeDeVinRepository.findById(id);
    }

    @Override
    public List<TypeDeVin> rechercheTypeDeVinsParNom(String nom) {
        return typeDeVinRepository.findByNom(nom);
    }

    @Override
    public TypeDeVin enregistreTypeDeVin(TypeDeVin typeDeVin) {
        return typeDeVinRepository.save(typeDeVin);
    }

    @Override
    public void supressionTypeDeVinParId(Integer id) {
        typeDeVinRepository.deleteById(id);
    }
}
