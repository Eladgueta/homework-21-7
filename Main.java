public class Main {
    public static void main(String[] args) {




        Vehicle v1 = new Vehicle("ford", "white",4);
        Car c1 = new Car("nisan","blc",4,"cx",160,052);
        Truck t1 = new Truck("daff","red",8,"rt",1800);
        bike b1 = new bike("wew","red",2);


        Vehicle v2 = new Car("gg","red",4,"2220",4,4);
        System.out.println(v2);

        Vehicle [] ER = new Vehicle[3];
        ER [0]=c1;
        ER [1]=b1;
        ER [2]=t1;



        Animal a1 = new Dog("joni");
        Animal a2 = new Cat("mantos");


        Animal [] AM = new Animal[2];
        AM [0] = new Dog("rio");
        AM [1] = new Cat("topi");

        System.out.println(AM[1]);













    }






}
