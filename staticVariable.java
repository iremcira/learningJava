class Mobile {

    String brand;
    int price;
    static String name;

    static {
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile() {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    
    public void show(){
        System.out.println(brand + ":" + price + ":" + name);
    }

    
}

public class staticVariable {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Mobile");
      
      
      
        // Mobile obj = new Mobile();
       // obj.brand= "Apple";
       // obj.price= 1500;
       // Mobile.name = "SmartPhone";

       // Mobile obj1 = new Mobile();
      
      
      
      
        //  Mobile obj1 = new Mobile();
       // obj1.price = 1500;
       // obj1.brand = "Apple";
       // Mobile.name = "Phone";

       // Mobile obj2 = new Mobile();
       // obj2.price = 1700;
       // obj2.brand = "Samsung";
       // Mobile.name = "SmartPhone";

       // Mobile.name = "Phone";

       // obj1.show();
       // obj2.show();
    }

}


