public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\nблагородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + bravery;
    }
    public static void comparingStudents(Gryffindor one, Gryffindor two) {

        if ((one.getNobility() + one.getHonor() + one.getBravery()) >= (two.getNobility() + two.getHonor() + two.getBravery())) {
            System.out.println(one.getName() + " лучший Гриффиндорец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Гриффиндорец, чем " + one.getName());
        }
    }
}
