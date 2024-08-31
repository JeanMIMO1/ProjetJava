package edu.mimo.InVinoVeritas.service;

import edu.mimo.InVinoVeritas.model.Vin;
import edu.mimo.InVinoVeritas.repository.VinRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class VinServiceImplTest {

    @Mock
    private VinRepository vinRepository;

    @InjectMocks
    private VinServiceImpl vinService;

    private AutoCloseable closeable;

    @BeforeEach
    public void setUp() {
        // Replace initMocks with openMocks
        closeable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    public void tearDown() throws Exception {
        // Ensure to close the open mocks
        closeable.close();
    }

    @Test
    public void testRechercheVinsParNom() {
        String nom = "Chardonnay";
        Vin vin1 = new Vin();
        vin1.setNom("Chardonnay");
        Vin vin2 = new Vin();
        vin2.setNom("Chardonnay");

        List<Vin> vins = Arrays.asList(vin1, vin2);

        // Assurez-vous d'utiliser la méthode correcte ici
        when(vinRepository.findByNom(nom)).thenReturn(vins);

        List<Vin> result = vinService.rechercheVinsParNom(nom);

        assertEquals(2, result.size());
        assertEquals("Chardonnay", result.get(0).getNom());
    }
}
