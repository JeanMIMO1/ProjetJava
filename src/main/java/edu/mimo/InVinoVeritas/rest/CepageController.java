package edu.mimo.InVinoVeritas.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import edu.mimo.InVinoVeritas.model.Cepage;
import edu.mimo.InVinoVeritas.service.CepageService;

@RestController
@RequestMapping("/cepages")
public class CepageController {

    private final CepageService cepageService;

    public CepageController(CepageService cepageService) {
        this.cepageService = cepageService;
    }


    @GetMapping
    public List<Cepage> allCepages() {
        return cepageService.allCepages();
    }


    @GetMapping("/{id}")
    public Cepage getCepageById(@PathVariable Integer id) {
        Optional<Cepage> cepage = cepageService.rechercheCepageParId(id);
        return cepage.orElse(null);
    }

   
    @GetMapping("/search")
    public List<Cepage> getCepagesByName(@RequestParam(required = false) String name) {
        if (name == null || name.isBlank()) {
            return cepageService.allCepages();
        }
        return cepageService.rechercheCepagesParNom(name);
    }


    @PostMapping
    public Cepage addCepage(@RequestBody Cepage cepage) {
        return cepageService.enregistreCepage(cepage);
    }

    
    @DeleteMapping("/{id}")
    public void deleteCepage(@PathVariable Integer id) {
        cepageService.supressionCepageParId(id);
    }
}