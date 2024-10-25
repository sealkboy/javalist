import java.util.List;

import org.junit.Test;

public class SemanaTest {
    private Semana semana;

    @BeforeEach
    public void setUp() {
        semana = new Semana();
        semana.listaDiasSemana(); // Inicializar la lista de días
    }

    @Test
    public void testListaDiasSemana() {
        List<String> dias = semana.getDiasSemana();
        assertEquals(7, dias.size(), "La lista debe tener 7 días.");
        assertTrue(dias.contains("Lunes"), "La lista debe contener Lunes.");
    }

    @Test
    public void testGetDiasSemana() {
        List<String> dias = semana.getDiasSemana();
        assertEquals(7, dias.size(), "La lista debe tener 7 días.");
        assertEquals("Martes", dias.get(1), "El segundo día debe ser Martes.");
    }


