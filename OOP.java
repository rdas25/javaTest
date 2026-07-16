public class OOP {
    
    String name;
    int age;

    public OOP(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public OOP(String name) {
        this(name, 0);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        OOP person1 = new OOP("John", 25);
        person1.displayInfo();

        OOP person2 = new OOP("Jack");
        person2.displayInfo();
    }

}