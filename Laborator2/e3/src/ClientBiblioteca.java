public class ClientBiblioteca {
    private String nume;
    private int cartiImprumutate;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getCartiImprumutate() {
        return cartiImprumutate;
    }

    public void setCartiImprumutate(int cartiImprumutate) {
        this.cartiImprumutate = cartiImprumutate;
    }

    public String infoClient() {
        String message = "Clientul " + this.nume + " a imprumutat " + this.cartiImprumutate + " carti";
        return message;
    }

}
