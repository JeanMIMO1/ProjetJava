package edu.mimo.InVinoVeritas.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import edu.mimo.InVinoVeritas.model.Vin;
import edu.mimo.InVinoVeritas.service.VinService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vins")
public class VinController {

    @Autowired
    private VinService vinService;

    @GetMapping
    public List<Vin> getAllVins() {
        return vinService.allVins();
    }

    @GetMapping("/{id}")
    public Optional<Vin> getVinById(@PathVariable Integer id) {
        return vinService.rechercheVinParId(id);
    }

    @GetMapping("/recherche")
    public List<Vin> getVinsByNom(@RequestParam String nom) {
        return vinService.rechercheVinsParNom(nom);
    }

    @PostMapping
    public Vin saveVin(@RequestBody Vin vin) {
        return vinService.enregistreVin(vin);
    }

    @DeleteMapping("/{id}")
    public void deleteVin(@PathVariable Integer id) {
        vinService.supressionVinParId(id);
    }
}
