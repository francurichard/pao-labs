public class Main {
    public static void main(String[] args) {
        ClientBiblioteca andrei = new ClientBiblioteca();
        andrei.setNume("Andrei");
        andrei.setCartiImprumutate(5);
        System.out.print(andrei.infoClient());
    }
}
