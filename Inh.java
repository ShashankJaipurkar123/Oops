public class Inh {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.color = "Blur";
        shark.breaths();
    }
}

class Animals{
    String color;

    void breaths(){
        System.out.println("breaths");
    }

    void eat(){
        System.out.println("Eats");
    }
}
class Fish extends Animals{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
