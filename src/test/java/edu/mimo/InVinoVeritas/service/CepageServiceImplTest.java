package edu.mimo.InVinoVeritas.service;

import edu.mimo.InVinoVeritas.model.Cepage;
import edu.mimo.InVinoVeritas.repository.CepageRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CepageServiceImplTest {

    @Mock
    private CepageRepository cepageRepository;

    @InjectMocks
    private CepageServiceImpl cepageServiceImpl;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRechercheCepagesParNom() {
        String nom = "Chardonnay";
        List<Cepage> expectedCepages = Arrays.asList(new Cepage());
        when(cepageRepository.findByNomContaining(nom)).thenReturn(expectedCepages);

        List<Cepage> result = cepageServiceImpl.rechercheCepagesParNom(nom);

        assertEquals(expectedCepages, result);
    }
}
