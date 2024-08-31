package edu.mimo.InVinoVeritas.rest;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import edu.mimo.InVinoVeritas.model.Appelation;
import edu.mimo.InVinoVeritas.service.AppelationService;


@RestController
@RequestMapping("/appelations")
public class AppelationController {

    private final AppelationService appelationService;

    public AppelationController(AppelationService appelationService) {
        this.appelationService = appelationService;
    }

   
    @GetMapping
    public List<Appelation> allAppelations() {
        return appelationService.allAppelations();
    }

 
    @GetMapping("/{id}")
    public Appelation getAppelationById(@PathVariable Integer id) {
        Optional<Appelation> appelation = appelationService.rechercheAppelationParId(id);
        return appelation.orElse(null);
    }

  
    @GetMapping("/search")
    public List<Appelation> getAppelationsByName(@RequestParam(required = false) String name) {
        if (name == null || name.isBlank()) {
            return appelationService.allAppelations();
        }
        return appelationService.rechercheAppelationsParNom(name);
    }

   
    @PostMapping
    public Appelation addAppelation(@RequestBody Appelation appelation) {
        return appelationService.enregistreAppelation(appelation);
    }

  
    @DeleteMapping("/{id}")
    public void deleteAppelation(@PathVariable Integer id) {
        appelationService.supressionAppelationParId(id);
    }
}