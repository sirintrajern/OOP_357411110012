package OOP_lab8;
import OOP_lab9.cow;
public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Chayen",2,"Bangkeaw");
        System.out.println(dog.toString());
        dog.makeNoise();

        cat cat = new cat("Giant",2,"Persian");
        System.out.println(cat.toString());
        cat.makeNoise();

        cow cow = new cow("Nmajai",5);
        System.out.println(cow.toString());
        cow.makeNoise();
        cow.myPet();

    }
}