public class OOPS extends OOP {

    public OOPS(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.printf("Name: %s, Age: %d%n", name, age);
    }

    public static void main(String[] args) {
        OOPS person = new OOPS("Alice", 30);
        person.displayInfo();

        System.out.println("Count: " + person.getCount());
        System.out.println("Total: " + person.getTotal());

        OOP polyPerson = new OOPS("Bob", 42);
        polyPerson.displayInfo();
    }

}
