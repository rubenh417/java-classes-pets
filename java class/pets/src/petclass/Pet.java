package petclass;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    // Empty constructor
    public Pet() {
        this.name = "";
        this.age = 0;
        this.location = "";
        this.type = "";
    }

    // Constructor with all attributes
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // Getter methods
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getType() {
        return this.type;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        // create a new pet instance using the empty constructor
        Pet myPet = new Pet();

        // use the setter methods to set the pet's attributes
        myPet.setName("Max");
        myPet.setAge(5);
        myPet.setLocation("New York");
        myPet.setType("Dog");

        // use the getter methods to access the pet's attributes
        System.out.println("Name: " + myPet.getName());
        System.out.println("Age: " + myPet.getAge());
        System.out.println("Location: " + myPet.getLocation());
        System.out.println("Type: " + myPet.getType());
    }

    private String getLocation() {
        return null;
    }
}
