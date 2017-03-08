
package cars;


public class employee {
    
    String FirstName;
    String LastName;
    int age;
    String Add;
    String tel;
    double salary;
    Car myCar;
    
    
    // 1000=> 10% 0.10  =>1100
    
    double getRaise (double raise){
        salary=salary + salary*raise;
        return salary;
    }
    
    
}
