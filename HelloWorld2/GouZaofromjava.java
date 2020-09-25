package HelloWorld2;

import java.util.Scanner;

class GouZaofromjava {
    public static void main(String[] args) {
        Psrson N1 = new Psrson();
        N1.setXxx();
        N1.getXxx();
    }
}

class Psrson {
    private int ID;
    private String name;
    private String Sex;

    public void setXxx() {
        Scanner Can = new Scanner(System.in);
        ID = Can.nextInt();
        name = Can.nextLine();
        Sex = Can.nextLine();
    }

    public void getXxx() {
        System.out.println(ID);
        System.out.println(name);
        System.out.println(Sex);
    }
}
