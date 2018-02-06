package OOP_lab9;

import OOP_lab8.Pet;

public class cow extends Pet {
public cow(String name,int age) {
    super(name,age);
}
    @Override
    public void makeNoise() {

    System.out.println("More More !!!");
    }
}
