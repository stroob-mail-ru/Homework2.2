public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magic, int transgression, int hardworking, int loyal, int honest) {
        super(name, magic, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\nтрудолюбие: " + hardworking +
                ", верность: " + loyal +
                ", честность: " + honest;
    }
    public static void comparingStudents(Hufflepuff one, Hufflepuff two) {

        if ((one.getHardworking() + one.getLoyal() + one.getHonest()) >= (two.getHardworking() + two.getLoyal() + two.getHonest())) {
            System.out.println(one.getName() + " лучший Пуффендуец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Пуффендуец, чем " + one.getName());
        }
    }
}
