package OOPS;

class Car{
    int model_number;
    String owner_name;
    static String car_company="Hyundai";
}

public class StaticExample{
    public static void main(String args[]){
        Car c1 = new Car();
        c1.model_number = 1;

        Car c2 = new Car();
        c2.model_number = 2;

        Car c3 = new Car();
        c3.model_number = 3;

        System.out.println(c1.car_company);

        c1.car_company = "Rolls Royce";

        System.out.println(c3.car_company);
        System.out.println(c3.car_company);


    }
}