public class Op1 {
    public static void main(String args[]){
        pen p1 = new pen();
        p1.setcolor("blue");
        //System.out.println(p1.color);
        //System.out.println(p1.getcolor());

        mobile phone = new mobile();
        phone.setmodel("Apple");
        phone.setprice(800000);

        //System.out.println(phone.getmodel());
        //System.out.println(phone.getprice());
        School s1 = new School("BVM");
        System.out.println(s1.name);
    }

}
class mobile{
    private String model;
    private int price;

    String getmodel(){
        return this.model ;
    }
    int getprice(){
        return this.price;
    }
    void setprice(int newprice){
        this.price = newprice;
    }
    void setmodel(String company){
        this.model = company;
    }
}
class pen{
    String color;
    int tipsize;
    String getcolor(){
        return this.color;
    }
    void settipsize(int new_tip){
        this.tipsize = new_tip;
    }

    void setcolor(String newcolor){
        this.color = newcolor;

    }    
}

class School{

    String name;

    School(String School_name){
        this.name = School_name;
    }
}