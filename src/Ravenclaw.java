public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int magic, int transgression, int smart, int wise, int witty, int creative) {
        super(name, magic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreative() {
        return creative;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\nумность: " + smart +
                ", мудрость: " + wise +
                ", остроумие: " + witty +
                ", творчество: " + creative;
    }
    public static void comparingStudents(Ravenclaw one, Ravenclaw two) {

        if ((one.getSmart() + one.getWise() + one.getWitty() + one.getCreative()) >= (two.getSmart() + two.getWise() + two.getWitty() + two.getCreative())) {
            System.out.println(one.getName() + " лучший Когтевранец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Когтевранец, чем " + one.getName());
        }
    }
}
