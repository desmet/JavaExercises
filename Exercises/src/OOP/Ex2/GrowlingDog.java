package OOP.Ex2;

import OOP.Ex1.Dog;

public class GrowlingDog extends Dog implements Growl{
//  without implementation: OOP.Ex2.GrowlingDog is not abstract and does not override abstract method growl() in OOP.Ex2.Growl
    public void growl(){
        System.out.println("Arrr!");
    }

    public static void main(String[] args) {
        GrowlingDog dog = new GrowlingDog();
        dog.growl();
    }
}
