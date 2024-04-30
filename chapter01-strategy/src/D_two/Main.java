package D_two;

import D_two.MallardDuck;
import D_two.ToyDuck;

public class Main {
    public static void main(String[] args){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.swim();
        toyDuck.fly();
    }
}