public class Abstractio {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        System.out.println(h.legs);
        
    }
}

abstract class Animal{
    int legs;
   Animal(){
    legs = 0;
   }

        void eat(){

        System.out.println("eats");
    }
}

class Horse extends Animal{
    void eat(){
        System.out.println("eats grass");
    }

    void noofleg(){
        legs = 4;
    }
    
}
