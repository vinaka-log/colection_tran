import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class hero {
    private String name;

    public hero(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {

        hero h1 = new hero("tanaka");
        hero h2 = new hero("nabe");

        List<hero> heros = new ArrayList<hero>();
        heros.add(h1);
        heros.add(h2);
        for (hero h : heros) {
            System.out.println(h.getName());
        }
    }
}
