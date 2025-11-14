class Mobile{
    static String name;
    int price;
    String brand;

    public void show(){
        System.out.println(name + ":" + price + ":" + brand);
    }
    public static void show1(Mobile obj2){
        System.out.println(name + ":" + obj2.price + ":" + obj2.brand);
    }
}




public class StaticMethod {
    public static void main(String[] args) {
        
        Mobile obj = new Mobile();
        Mobile.name = "SmartPhone";
        obj.price = 1500;
        obj.brand = "Apple";

        Mobile obj1 = new Mobile();
        Mobile.name = "SmartPhone";
        obj1.price = 1700;
        obj1.brand = "Samsung";

        Mobile.name = "Phone";

        obj.show();
        obj1.show();

        Mobile.show1(obj1);


    }
    
}
