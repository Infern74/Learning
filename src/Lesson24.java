public class Lesson24 {
    public static void main(String[] args) {
        chelik h1 =  new chelik("Tom",22);
        System.out.println(h1);
    }
}
class chelik{
    private final String name;
    private final int age;

    public chelik(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return name + " " + age;
    }
}