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

    @Test
    public void testGetTamañoLista() {
        assertEquals(7, semana.getTamañoLista(), "El tamaño de la lista debe ser 7.");
    }

    @Test
    public void testEliminarDia() {
        String resultado = semana.eliminarDia("Martes");
        assertEquals("Martes ha sido eliminado de la lista.", resultado, "El día Martes debe ser eliminado.");
        assertEquals(6, semana.getTamañoLista(), "El tamaño de la lista debe ser 6 después de eliminar Martes.");
        
        resultado = semana.eliminarDia("Funday");
        assertEquals("Funday no se encontró en la lista.", resultado, "Funday no debe encontrarse en la lista.");
    }