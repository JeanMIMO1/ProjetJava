package edu.mimo.InVinoVeritas.service;

import edu.mimo.InVinoVeritas.model.Cepage;
import edu.mimo.InVinoVeritas.repository.CepageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CepageServiceImpl implements CepageService {

    private final CepageRepository cepageRepository;

    @Autowired
    public CepageServiceImpl(CepageRepository cepageRepository) {
        this.cepageRepository = cepageRepository;
    }

    @Override
    public List<Cepage> allCepages() {
        return cepageRepository.findAll();
    }

    @Override
    public Cepage enregistreCepage(Cepage cepage) {
        return cepageRepository.save(cepage);
    }

    @Override
    public Optional<Cepage> rechercheCepageParId(Integer id) {
        return cepageRepository.findById(id);
    }

    @Override
    public List<Cepage> rechercheCepagesParNom(String nom) {
        return cepageRepository.findByNomContaining(nom);  // Assurez-vous que cette méthode existe dans le repository
    }

    @Override
    public void supressionCepageParId(Integer id) {
        cepageRepository.deleteById(id);
    }
}
