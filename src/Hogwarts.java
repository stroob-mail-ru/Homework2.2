public class Hogwarts {
    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return name + "\nСила магии: " + magic + ", расстояние трансгрессии:" + transgression;
    }
    public static void comparingStudents(Hogwarts one, Hogwarts two) {

        if ((one.getMagic() + one.getTransgression()) >= (two.getMagic() + two.getTransgression())) {
            System.out.println(one.getName() + " обладает бОльшей мощностью магии, чем " + two.getName());
        } else {
            System.out.println(two.getName() + " обладает бОльшей мощностью магии, чем " + one.getName());
        }
    }
}
