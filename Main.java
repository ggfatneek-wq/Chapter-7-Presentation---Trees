import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> species = new HashMap<>();

        species.put("Deer", 120);
        species.put("Fox", 35);
        species.put("Bear", 12);
        species.put("Wolf", 25);
        species.put("Rabbit", 200);

        String name = "Fox";
        Integer population = species.get(name);

        if (population != null) {
            System.out.println(name + " population: " + population);
        } else {
            System.out.println("Species not found.");
        }
    }
}
