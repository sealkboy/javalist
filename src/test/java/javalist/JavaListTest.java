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

    @Test
    public void testGetDia() {
        assertEquals("Has elegido este día: Miércoles", semana.getDia(2), "El tercer día debe ser Miércoles.");
        assertEquals("Índice fuera de rango.", semana.getDia(10), "El índice 10 está fuera de rango.");
    }

    @Test
    public void testExisteDia() {
        assertEquals("Sí, existe el día: Lunes", semana.existeDia("Lunes"), "Debería existir Lunes.");
        assertEquals("No existe el día: Funday", semana.existeDia("Funday"), "Funday no debería existir.");
    }

    @Test
    public void testOrdenarDiasAlfa() {
        semana.ordenarDiasAlfa();
        List<String> dias = semana.getDiasSemana();
        assertEquals("Domingo", dias.get(0), "El primer día después de ordenar debe ser Domingo.");
        assertEquals("Viernes", dias.get(6), "El último día después de ordenar debe ser Viernes.");
    }

    @Test
    public void testVaciarLista() {
        semana.vaciarLista();
        assertEquals(0, semana.getTamañoLista(), "La lista debe estar vacía después de vaciarla.");
    }
}