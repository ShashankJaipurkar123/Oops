public class Hybrid {
    public static void main(String args[]){
        Dog sheru = new Dog();
        sheru.breaths();

    }
}

class Animals{
    void breaths(){
        System.out.println("Breaths");
    }
    void eats(){
        System.out.println("eats");
    }
}
class Mammals extends Animals{
    void legs(){
        System.out.println("have legs");
    }
}

class Birds extends Animals{
    void feathures(){
        System.out.println("have feathures");
    }
}

class Fish extends Animals{
    void wings(){
        System.out.println("have wings");
    }
}

class Shark extends Fish{
    void swim(){
        System.out.println("can swim in sea");
    }
}

class Dog extends Mammals{
    String color;
    int legs;
}


