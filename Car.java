package cars;

public class Car {

    int gas;
    public String color;
    int year;
    double temp;
    int speed;
    boolean Isrunning;
    employee driver;
    
    employee [] passengers = new employee [4];
    
    

    public Car(int g,String c,int y) {
        gas = g;
        color = c;
        year = y;
        speed = 20;
        boolean Isrunning;

        if (g < 10) {
            Isrunning = false;
        } else {
            Isrunning = true;
        }

    }

    boolean turnon() {
        Isrunning = true;
        gas--;
        temp++;

        return Isrunning;
    }

    boolean turnoff() {
        Isrunning = false;

        return Isrunning;
    }

    void accelerate() {
        if (Isrunning) {
            gas--;
            speed++;

        }
    }

}
