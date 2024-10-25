import java.util.ArrayList;
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

    
