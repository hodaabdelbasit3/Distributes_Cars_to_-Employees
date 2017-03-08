package cars;

public class Cars {

    public static void main(String[] args) {

        Car c1 = new Car(30, "Red", 2012);

        //c1.color="Red";
        //  c1.gas=20;
        // c1.speed=125;
        //  c1.Isrunning=true;
        c1.accelerate();
        c1.turnon();

        System.out.println(c1.Isrunning);
        System.out.println(c1.color);

        Car c2 = new Car(10, "Black", 2010);
        // c2.color="black";
        // c2.speed=130;
        // c2.Isrunning=false;
        c2.turnoff();
        c2.accelerate();

        System.out.println(c2.color);
        System.out.println(c2.Isrunning);

        employee e1 = new employee();

        e1.FirstName = "Ahmed";
        e1.LastName = "Ali";
        e1.age = 20;
        e1.salary = 1000;
        e1.myCar = c1;
        System.out.println(e1.myCar.color);

        employee e2 = new employee();

        e2.FirstName = "hoda";
        e2.LastName = "Ali";
        e2.age = 23;
        e2.salary = 3000;
        e2.myCar = c2;
        c2.driver = e2;
        System.out.println(c2.driver.LastName);
        
        c1.passengers[0]=e1;
        c2.passengers[1]=e2;
        System.out.println(c1.passengers[0].FirstName);
    }

}
