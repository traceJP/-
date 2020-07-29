package teacher;

import java.util.Scanner;

class Dog{

    Scanner Cin = new Scanner(System.in);

    public void set(){
        name = Cin.nextLine();
        color = Cin.nextLine();
        age = Cin.nextInt();
    }

    public void get(){
        System.out.println("name:" + name + "\t" + "color:" + color + "\t" + "age:" + age);
    }

    private String name;
    private String color;
    private int age;

}

public class Object_Code4_2020056 {

    public static void main(String[] args) {
        Dog test = new Dog();
        test.set();
        test.get();
    }

}
