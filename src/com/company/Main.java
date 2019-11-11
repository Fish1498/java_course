package com.company;


public class Main {


    public static void main(String[] args) {
        Man marcu = new Man();
        marcu.set_man("Marcu",24);
        marcu.setAge(23);
        Man Alina = new Man();
        Alina.set_man("Alina",21);
        marcu.walk();
        marcu.eat();

        Car dacia = new Car();
        dacia.set_car(Car.Color.Red, "Sandero", "Automatic", 5);
        dacia.accelerate();
        dacia.accelerate();
        dacia.stop();
        dacia.get_Driver().add(marcu.getName());
        System.out.println(dacia.get_Driver());
//Ex 2 - toString with StringBuffer and StringBuilder
        String car = dacia.toString();
        StringBuilder strBuilder = new StringBuilder(car);
        System.out.println("Capacity: " + strBuilder.capacity());
        String man = marcu.toString();
        StringBuffer strBuffer = new StringBuffer(man);
        System.out.println("Capacity: " + strBuffer.capacity());
//Ex 2 - hashcode
        System.out.println(marcu.hashCode());
//Ex 2 - equals
        System.out.println(marcu.equals(Alina));

        dacia.addPassenger(marcu);
        dacia.addPassenger(marcu);
        dacia.addPassenger(marcu);
        dacia.addPassenger(marcu);
        dacia.addPassenger(marcu);
        dacia.addPassenger(marcu);
        dacia.addPassenger(marcu);
        dacia.addPassenger(marcu);
        dacia.addPassenger(marcu);
        System.out.println("" + dacia.passengers);

        dacia.accelerate(5);
        dacia.accelerate(5);
        dacia.accelerate(5);
        dacia.accelerate(5);
        dacia.accelerate(5);
        dacia.accelerate(5);
//Ex 12 - interface
        dacia.printinfo();
    }

}