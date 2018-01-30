package OOP_lab8;

public abstract class Dog extends Pet {
    private String breed;
    public Dog(String name, int age) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
