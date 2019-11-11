package com.company;

import java.util.ArrayList;
//Ex 1  - class car
public class Car extends Abstract implements Volvo{
    Color color;
    String model;
    int speed_number = 0;
    int channels;
    int capacity;
    int speed = 0;

    ArrayList<Man> passengers = new ArrayList<Man>(capacity);
    ArrayList<String> driver = new ArrayList<String>(1);

    //Ex 9 - enum class for the color of the car
    enum Color{
        Black,
        Blue,
        Red,
        Green,
        White
    }

    protected void set_car(Color color, String model, String TypeofBox, int capacity){
        this.color = color;
        this.model = model;
        this.capacity = capacity;
        this.passengers.ensureCapacity(this.capacity-1);
    }
    private int get_capacity(){
        return this.capacity;
    }

    protected ArrayList<String> get_Driver(){
        return this.driver;
    }

    protected String set_Driver (String hey) {
        this.driver.add(hey);
        return("Driver is " + hey);
    }

    protected void accelerate(){
        if (this.speed < 200) {
            this.speed = this.speed + 30;
            System.out.printf("%s accelerated, speed is %d\n", this.model, this.speed);
        }
        else{
            System.out.print("It is maximum speed!!!");
        }
    }
    //Ex 7
    protected void accelerate(int channels) {
        if (this.speed_number < channels)
        {
            this.speed = this.speed + 50;
            this.speed_number = this.speed_number + 1;
            System.out.println(this.speed_number);
            System.out.printf("%s accelerated, speed is %d, speed number is %d\n", this.model, this.speed, this.speed_number);

        }
        else
        {
            System.out.print("Maxim Speed.");
        }
    }

    protected void stop(){
        speed = 0;
        System.out.printf("%s stopped\n", model);
    }

    public void printinfo(){
        System.out.print("" + this.color + " " + this.model + ".\n");
    }

    public String toString(){
        return "Car " + model + " " + capacity;
    }
    //Ex  10
    public void addPassenger(Man m) {
        if(passengers.size() >= get_capacity()) {
            try {
                passengers.remove(m);
                throw new Exception("Too much passengers");
            }
            catch (Exception e) {
                System.out.println("There cannot be more passengers than allowed");
            }
        }
        passengers.add(m);
    }

}
