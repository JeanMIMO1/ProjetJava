package edu.mimo.InVinoVeritas.service;


import edu.mimo.InVinoVeritas.model.Appelation;
import edu.mimo.InVinoVeritas.repository.AppelationRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;



class AppelationServiceImplTest {

    @Mock
    private AppelationRepository appelationRepository;

    @InjectMocks
    private AppelationServiceImpl appelationService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAllAppelations() {
        
        Appelation appelation1 = new Appelation();
        Appelation appelation2 = new Appelation();
        when(appelationRepository.findAll()).thenReturn(Arrays.asList(appelation1, appelation2));

        
        List<Appelation> result = appelationService.allAppelations();

        
        assertNotNull(result);
        assertEquals(2, result.size());
        verify(appelationRepository, times(1)).findAll();
    }

    @Test
    void testRechercheAppelationParId() {
        
        Appelation appelation = new Appelation();
        when(appelationRepository.findById(1)).thenReturn(Optional.of(appelation));

        
        Optional<Appelation> result = appelationService.rechercheAppelationParId(1);

        
        assertTrue(result.isPresent());
        assertEquals(appelation, result.get());
        verify(appelationRepository, times(1)).findById(1);
    }

    @Test
    void testRechercheAppelationsParNom() {
        
        Appelation appelation1 = new Appelation();
        Appelation appelation2 = new Appelation();
        when(appelationRepository.rechercheAppelationParNom("Bordeaux"))
            .thenReturn(Arrays.asList(appelation1, appelation2));

       
        List<Appelation> result = appelationService.rechercheAppelationsParNom("Bordeaux");

        
        assertNotNull(result);
        assertEquals(2, result.size());
        verify(appelationRepository, times(1)).rechercheAppelationParNom("Bordeaux");
    }

    @Test
    void testEnregistreAppelation() {
        
        Appelation appelation = new Appelation();
        when(appelationRepository.save(appelation)).thenReturn(appelation);

        
        Appelation result = appelationService.enregistreAppelation(appelation);

        
        assertNotNull(result);
        assertEquals(appelation, result);
        verify(appelationRepository, times(1)).save(appelation);
    }

    @Test
    void testSupressionAppelationParId() {
       
        int id = 1;

        
        appelationService.supressionAppelationParId(id);

        
        verify(appelationRepository, times(1)).deleteById(id);
    }
}
