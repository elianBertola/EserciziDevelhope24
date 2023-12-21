import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Articoli articolo1 = new Articoli("Coca cola",0.59);
        Articoli articolo2 = new Articoli("Prosciutto cotto",1.05);
        Articoli articolo3 = new Articoli("Kinder",1.99);

        //metodo di inizializzazione 1
        Map<String, Articoli> mappaArticoli = new HashMap<>();
        mappaArticoli.put("Bevande", articolo1);
        mappaArticoli.put("Cibo", articolo2);
        mappaArticoli.put("Dolce",articolo3);
        System.out.println(mappaArticoli);

        //metodo di inizializzazione 2
        Map<String, Articoli> mappaArticoli2 = Map.of("Bevande",articolo1,"Cibo",articolo2,"Dolce",articolo3);
        System.out.println(mappaArticoli2);

        //metodo di inizializzazione 3
        Map<String, Articoli> mappaArticoli3 = new HashMap<>(Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Bevande",articolo1),
                new AbstractMap.SimpleEntry<>("Cibo", articolo2),
                new AbstractMap.SimpleEntry<>("Dolce",articolo3)
            )
        );
        System.out.println(mappaArticoli3);
    }
}