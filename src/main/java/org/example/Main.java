package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void print(Mobile mobile) {
        mobile.move();
    }

    public static void introduce(Talkable talkable) {
        talkable.sayHello("Mateusz");
    }

    public static <T extends Mobile> T genericMethod(List<T> list) {
        for (T listElement : list) {
            if (listElement instanceof Vehicle) {
                System.out.println("This is vehicle. Max speed: " + ((Vehicle) listElement).getMaxSpeed());
            } else System.out.println("This is not a vehicle");
        }
        return list.get(new Random().nextInt(list.size()));
    }

    public static void main(String[] args) {

        List<Mobile> mobileList = new ArrayList<>();

        var firstTruck = new Truck();
        mobileList.add(firstTruck);
        var secondTruck = new Truck();
        mobileList.add(secondTruck);
        var firstBoat = new Boat();
        mobileList.add(firstBoat);
        var secondBoat = new Boat();
        mobileList.add(secondBoat);
        var firstHuman = new Human();
        mobileList.add(firstHuman);
        var secondHuman = new Human();
        mobileList.add(secondHuman);

        var thirdTruck = new Truck() {
            @Override
            public void move() {
                System.out.println("I'm a super truck, I can drive with 350 km/h");
            }
        };
        mobileList.add(thirdTruck);

        var randomObjectFromList = genericMethod(mobileList);
        randomObjectFromList.move();

        print(
                () -> System.out.println("I cannot run at all")
        );

        introduce(
                (string) -> System.out.println("Hello " + string)
        );

    }

}