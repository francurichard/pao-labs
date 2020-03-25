public class Album implements Comparable<Album> {
    String nume;
    double rating;
    int anLansare;

    public Album(String nume, double rating, int anLansare) {
        this.nume = nume;
        this.anLansare = anLansare;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public int getAnLansare() {
        return anLansare;
    }

    public String getNume() {
        return nume;
    }

    public void setAnLansare(int anLansare) {
        this.anLansare = anLansare;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(Album album) {
        if (this.nume.compareTo((album.nume)) == 0) {
            if (this.rating <= album.rating) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return this.nume.compareTo(album.nume);
        }
    }
}
