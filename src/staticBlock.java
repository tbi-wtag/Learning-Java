class Mobile{
    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
    }

    public Mobile(){
        brand = "";
        price = 200;
    }

    public void showDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

}
public class staticBlock {
    public static void main(String[] args) throws Exception {

        Class.forName("Mobile");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone";


    }
}


//A static block is a piece of code that runs automatically just one time when a class is loaded into memory. 
// It runs before any objects are created and before any method
