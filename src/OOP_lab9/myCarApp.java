package OOP_lab9;

public class myCarApp {
    public static void main(String[] args) {
        //engine
        Engine engine = new Engine("1500 CC","V-TEC V4");
        //car
        car car = new car("Honda","Black",engine);
        System.out.println(car.toString());
        car car1 = new car("Honda","Red",engine);
        System.out.println(car1.toString());
    }//main
}//class

