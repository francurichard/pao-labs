public class Main {
    public static void main(String[] args) {
        OutTask task1 = new OutTask("mesaj");
        task1.execute();
        RandomOutTask task2 = new RandomOutTask();
        task2.execute();
        CounterOutTask task3 = new CounterOutTask();
        task3.execute();
        CounterOutTask task4 = new CounterOutTask();
        task4.execute();
    }
}
