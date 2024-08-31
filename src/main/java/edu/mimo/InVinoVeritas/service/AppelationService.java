package edu.mimo.InVinoVeritas.service;

import java.util.List;
import java.util.Optional;  

import org.springframework.stereotype.Service;

import edu.mimo.InVinoVeritas.model.Appelation;

@Service
public interface AppelationService {

   
    public List<Appelation> allAppelations();

    
    public Optional<Appelation> rechercheAppelationParId(Integer id);

   
    public List<Appelation> rechercheAppelationsParNom(String name);

    
    public Appelation enregistreAppelation(Appelation Appelation);

    
    public void supressionAppelationParId(Integer id);
}