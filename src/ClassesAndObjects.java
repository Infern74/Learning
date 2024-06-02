public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person();
        person1.setNameAndAge("John", 18);
        int year1 = person1.calculateBirthday();
        person1.speak();
        System.out.println("Год рождения " + year1);

        Person person2;
        person2 = new Person();
        person2.setNameAndAge("Jane", 20);
    }
}

class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculateBirthday() {
        int year = 2024 - age;
        return year;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}