public class RandomOutTask implements Task {
    double rand;

    public RandomOutTask() {
        this.rand = Math.random();
    }

    @Override
    public void execute() {
        System.out.println(this.rand);
    }
}
