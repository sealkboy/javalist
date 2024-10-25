import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Semana {
    private List<String> diasSemana = new ArrayList<>();

    // Inicializar la lista con los días de la semana
    public void listaDiasSemana() {
        diasSemana = new ArrayList<>(List.of("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
    }

    // Retorna una copia de la lista de días de la semana
    public List<String> getDiasSemana() {
        return new ArrayList<>(diasSemana);
    }

    // Retorna el tamaño de la lista
    public int getTamañoLista() {
        return diasSemana.size();
    }

    // Eliminar un día de la lista y devolver un mensaje
    public String eliminarDia(String dia) {
        if (diasSemana.contains(dia)) {
            diasSemana.remove(dia);
            return dia + " ha sido eliminado de la lista.";
        } else {
            return dia + " no se encontró en la lista.";
        }
    }

    // Retornar un día específico de la lista
    public String getDia(int index) {
        if (index >= 0 && index < diasSemana.size()) {
            return "Has elegido este día: " + diasSemana.get(index);
        } else {
            return "Índice fuera de rango.";
        }
    }

    // Verificar si un día existe en la lista
    public String existeDia(String dia) {
        return diasSemana.contains(dia) ? "Sí, existe el día: " + dia : "No existe el día: " + dia;
    }

    // Ordenar la lista alfabéticamente
    public void ordenarDiasAlfa() {
        Collections.sort(diasSemana);
    }

    // Vaciar la lista
    public void vaciarLista() {
        diasSemana.clear();
    }
}
