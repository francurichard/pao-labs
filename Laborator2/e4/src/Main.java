import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student students[] = new Student[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String nume = sc.next();
            float nota = sc.nextFloat();
            students[i] = new Student(nume, nota);
        }

        for (Student student:
             students) {
            System.out.println(student.info());
        }
    }
}
