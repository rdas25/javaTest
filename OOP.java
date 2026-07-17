public class OOP {
    
    String name;
    int age;

    int count;
    static int total = 0;

    public OOP(String name, int age) {
        this.name = name;
        this.age = age;
        this.count = 0;
    }

    public OOP(String name) {
        this(name, 0);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public int getCount() {
        count++;
        return count;
    }

    public int getTotal() {
        total++;
        return total;
    }

    public static void main(String[] args) {
        OOP person1 = new OOP("John", 25);
        person1.displayInfo();

        OOP person2 = new OOP("Jack");
        person2.displayInfo();

        System.out.println("Person 1 Count: " + person1.getCount());
        System.out.println("Person 2 Total: " + person2.getTotal());
    }

}