public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 10, 10, 10, 10, 10);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 10, 9, 9, 9, 9);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 4, 8, 1, 9, 3);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 3, 1, 5, 7, 2);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 5, 5, 6, 1, 2);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 9, 10, 4, 3, 8);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 8, 4, 7, 1, 9, 3);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 5, 7, 6, 8, 1, 2);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 4, 8, 4, 6, 6, 6);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 9, 7, 2, 4, 6, 8, 1);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 2, 1, 4, 4, 9, 4, 5);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 7, 3, 2, 6, 6, 6, 4);

        System.out.println();
        System.out.println(harryPotter);

        System.out.println();
        System.out.println("Сравнение по факультетам:");
        Gryffindor.comparingStudents(harryPotter, hermioneGranger);
        Hufflepuff.comparingStudents(cedricDiggory, justinFinchFletchley);
        Ravenclaw.comparingStudents(zhouChang, marcusBelby);
        Slytherin.comparingStudents(dracoMalfoy, grahamMontague);

        System.out.println();
        System.out.println("Сравнение по школе:");
        Hogwarts.comparingStudents(padmaPatil, gregoryGoyle);
    }
}