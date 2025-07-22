package Reaprendendo;

import java.util.ArrayList;
import java.util.List;

public class ListaDeNomes {
    public List<String> names() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Vinicius");
        nomes.add("Ana");
        nomes.add("Julia");

        nomes.remove("Julia");

        return nomes;
    }

}
