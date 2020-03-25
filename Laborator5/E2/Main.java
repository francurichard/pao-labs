import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void afisare(List<Album> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getNume() + " " + list.get(i).getRating() + " " + list.get(i).getAnLansare());
        }
    }

    public static void main(String[] args) {
        List<Album> listaAlbume = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            listaAlbume.add(new Album("nume" + ((15 - i) % 13), i * 0.5, 2000 + i));
        }
        afisare(listaAlbume);
        Collections.sort(listaAlbume);
        System.out.println("****************************");
        afisare(listaAlbume);
    }
}
