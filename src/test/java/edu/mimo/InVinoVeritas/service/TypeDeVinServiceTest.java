package edu.mimo.InVinoVeritas.service;

import edu.mimo.InVinoVeritas.model.TypeDeVin;
import edu.mimo.InVinoVeritas.repository.TypeDeVinRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class TypeDeVinServiceTest {

    @Mock
    private TypeDeVinRepository typeDeVinRepository;

    @InjectMocks
    private TypeDeVinServiceImpl typeDeVinService;

    public TypeDeVinServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAllTypeDeVins() {
        TypeDeVin type1 = new TypeDeVin();
        TypeDeVin type2 = new TypeDeVin();
        when(typeDeVinRepository.findAll()).thenReturn(Arrays.asList(type1, type2));

        List<TypeDeVin> types = typeDeVinService.allTypeDeVins();
        assertEquals(2, types.size());
    }

    @Test
    public void testRechercheTypeDeVinParId() {
        TypeDeVin type = new TypeDeVin();
        when(typeDeVinRepository.findById(1)).thenReturn(Optional.of(type));

        Optional<TypeDeVin> foundType = typeDeVinService.rechercheTypeDeVinParId(1);
        assertTrue(foundType.isPresent());
    }

    @Test
    public void testRechercheTypeDeVinsParNom() {
        TypeDeVin type = new TypeDeVin();
        when(typeDeVinRepository.findByNom("Rouge")).thenReturn(Arrays.asList(type));

        List<TypeDeVin> foundTypes = typeDeVinService.rechercheTypeDeVinsParNom("Rouge");
        assertEquals(1, foundTypes.size());
    }

    @Test
    public void testEnregistreTypeDeVin() {
        TypeDeVin type = new TypeDeVin();
        when(typeDeVinRepository.save(type)).thenReturn(type);

        TypeDeVin savedType = typeDeVinService.enregistreTypeDeVin(type);
        assertNotNull(savedType);
    }

    @Test
    public void testSupressionTypeDeVinParId() {
        typeDeVinService.supressionTypeDeVinParId(1);
        verify(typeDeVinRepository, times(1)).deleteById(1);
    }
}
