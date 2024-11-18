package javalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaList {
    private List<String> diasSemana = new ArrayList<>();

    public JavaList() {
        this.diasSemana = new ArrayList<>();
    }

    public void listaDiasSemana() {
        diasSemana.clear(); // Limpiar la lista antes de llenarla
        diasSemana.add("Lunes");
        diasSemana.add("Martes");
        diasSemana.add("Miércoles");
        diasSemana.add("Jueves");
        diasSemana.add("Viernes");
        diasSemana.add("Sábado");
        diasSemana.add("Domingo");
    }    

    public List<String> getDiasSemana() {
        return new ArrayList<>(diasSemana);
    }

    public int getTamañoLista() {
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
        if (index >= 0 && index < diasSemana.size()) {
            return "Has elegido este día: " + diasSemana.get(index);
        } else {
            return "Índice fuera de rango.";
        }
    }

    public String existeDia(String dia) {
        return diasSemana.contains(dia) ? "Sí, existe el día: " + dia : "No existe el día: " + dia;
    }

    public void ordenarDiasAlfa() {
        Collections.sort(diasSemana);
    }

    public void vaciarLista() {
        diasSemana.clear();
    }
}
