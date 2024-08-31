package edu.mimo.InVinoVeritas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.mimo.InVinoVeritas.model.Appelation;
import edu.mimo.InVinoVeritas.repository.AppelationRepository;

@Service
public class AppelationServiceImpl implements AppelationService {

    private final AppelationRepository appelationRepository;

    public AppelationServiceImpl(AppelationRepository appelationRepository) {
        this.appelationRepository = appelationRepository;
    }

    @Override
    public List<Appelation> allAppelations() {
        return appelationRepository.findAll();
    }

    @Override
    public Optional<Appelation> rechercheAppelationParId(Integer id) {
        return appelationRepository.findById(id);
    }

    @Override
    public List<Appelation> rechercheAppelationsParNom(String name) {
        return appelationRepository.rechercheAppelationParNom(name);
    }

    @Override
    public Appelation enregistreAppelation(Appelation appelation) {
        return appelationRepository.save(appelation);
    }

    @Override
    public void supressionAppelationParId(Integer id) {
        appelationRepository.deleteById(id);
    }
}