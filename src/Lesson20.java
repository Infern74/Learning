public class Lesson20 {
    public static void main(String[] args) {
        Humans human1 = new Humans("Bob", 42);
        Humans human2 = new Humans("John", 52);
        human1.printNumberOfPeople();

    }
}

class Humans {

    private String name;
    private int age;
    private static int countPeople;

    public static String description;

    public Humans(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void printNumberOfPeople(){
        System.out.println(countPeople);
    }

}