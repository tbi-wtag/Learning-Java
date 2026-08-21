class Mobile{
    String brand;
    int price;
    static String name;

    public void showDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
    }

    public static void show(){
        System.out.println(name);
    }

    public static void show1(Mobile obj1){
        System.out.println(obj1.brand + ":" + obj1.price + ":" + name );
    }
}

public class staticMethod {
    public static void main(String[] args) throws Exception {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
        
        Mobile.name = "SmartPhone";

        Mobile.show1(obj1);
        System.out.println();

        obj1.showDetails();
        System.out.println();

        obj2.showDetails();
        System.out.println();
    }
}


//You can use a static variable instead of a static method.
//You cannot use a non-static variable inside a static method.

//A static method in Java is associated with the class, not with any object or instance.
//It can be accessed by all instances of the class, but it does not rely on any specific instance.
//Static methods can access static variables directly without the need for an object.
//They cannot access non-static variables (instance) or methods directly.
//Static methods can be accessed directly in both static and non-static contexts.