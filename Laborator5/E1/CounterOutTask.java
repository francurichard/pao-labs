public class CounterOutTask implements Task{
    public static int c = 0;

    public CounterOutTask() {

    }

    @Override
    public void execute() {
        c++;
        System.out.println(c);
    }
}
