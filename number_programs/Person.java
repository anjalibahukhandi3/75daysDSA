public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);

        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
