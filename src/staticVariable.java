class Mobile{
    String brand;
    int price;
    static String name;

    public void showDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }
}

public class staticVariable {
    public static void main(String[] args) throws Exception {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
        
        Mobile.name = "SmartPhone";


        obj1.showDetails();
        obj2.showDetails();
    }
}

