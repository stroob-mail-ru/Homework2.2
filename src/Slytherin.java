public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness ;
    private int thirstForPower;

    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ",\nхитрость: " + cunning +
                ", решительность: " + determination +
                ", амбициозность: " + ambition +
                ", находчивость: " + resourcefulness +
                ", жажда власти: " + thirstForPower;
    }
    public static void comparingStudents(Slytherin one, Slytherin two) {

        if ((one.getCunning() + one.getDetermination() + one.getAmbition() + one.getResourcefulness() + one.getThirstForPower()) >= (two.getCunning() + two.getDetermination() + two.getAmbition() + one.getResourcefulness() + one.getThirstForPower())) {
            System.out.println(one.getName() + " лучший Слизеринец, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " лучший Слизеринец, чем " + one.getName());
        }
    }
}
