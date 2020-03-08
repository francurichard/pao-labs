public class Student {
    private String nume;
    private float nota;

    public float getNota() {
        return nota;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String info() {
        String message = this.nume + " " + nota;
        return message;
    }

    public Student(String nume, float nota) {
        this.nota = nota;
        this.nume = nume;
    }
}
