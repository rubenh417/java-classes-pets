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
}

