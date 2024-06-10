public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person();
        person1.setName("Антон");
        person1.setAge(-10);
        int year1 = person1.calculateBirthday();
        System.out.println(person1.getAge());

    }
}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()){
            System.out.println("Введено пустое имя");
        } else{
            name = userName;
        }
    }
    public void setAge(int userAge) {
        if (userAge < 0){
            System.out.println("Возраст должен быть положительным");
        } else{
            age = userAge;
        }
    }

    public int getAge() {
        return age;
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