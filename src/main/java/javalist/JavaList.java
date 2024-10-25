import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Semana {
    private List<String> diasSemana = new ArrayList<>();

    public void listaDiasSemana() {
        diasSemana = List.of("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");
    }

    public List<String> getDiasSemana(){
        return new ArrayList<>(diasSemana);
    }

    public int getTamañoLista(){
        return diasSemana.size();
    }

    public String eliminarDia(String dia) {
        if (diasSemana.contains(dia)) {
            diasSemana.remove(dia);
            return dia + " ha sido eliminado de la lista.";
        } else {
            return dia + " no se encontró en la lista.";
        }
    }

    public String getDia(int index) {
        if(index >= 0 && index < diasSemana.size()) {
            return "Has elegido este día: " + diasSemana.get(index);
        } else {
            return "Índice fuera de rango.";
        }
    }

    public boolean existeDia(String dia) {
        return diasSeaman.contains(dia) ? "Sí, existe el día: " + dia : "No existe el día: " + dia;
    }

    public void ordenarDiasAlfa() {
        Collections.sort(diasSemana);
    }

    public void vaciarLista() {
        diasSemana.clear();
    }

}