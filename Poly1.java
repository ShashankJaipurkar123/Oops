public class Poly1 {

    public static void main(String args[]){
        calculator c = new calculator();
        c.sum(2,4);
        c.sum((float) 2.4, (float) 5.2);
    }
    
}

class calculator{
    void sum(int a, int b ){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    void sum(float a, float b){
        System.out.println(a+b);
    }

}
