package edu.mimo.InVinoVeritas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.mimo.InVinoVeritas.model.Vin;
import edu.mimo.InVinoVeritas.repository.VinRepository;
import java.util.List;
import java.util.Optional;

@Service
public class VinServiceImpl implements VinService {

    @Autowired
    private VinRepository vinRepository;

    @Override
    public List<Vin> allVins() {
        return vinRepository.findAll();
    }

    @Override
    public Optional<Vin> rechercheVinParId(Integer id) {
        return vinRepository.findById(id);
    }

    @Override
    public List<Vin> rechercheVinsParNom(String nom) {
        return vinRepository.findByNom(nom);
    }

    @Override
    public Vin enregistreVin(Vin vin) {
        return vinRepository.save(vin);
    }

    @Override
    public void supressionVinParId(Integer id) {
        vinRepository.deleteById(id);
    }
}
