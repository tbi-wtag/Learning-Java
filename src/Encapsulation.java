//Encapsulation in Java is an object-oriented programming (OOP) concept that bundles data (variables) 
// and methods into a single unit (a class) while restricting direct external access. 
// Often referred to as data hiding, it forces outside code to interact with an object's data exclusively 
// through defined, controlled entry points.


class Human{
    private int age = 11;
    private String name = "Navin";

    public int getAge(){ //getter
        return age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){  //setter
        age = a;
    }

    public void setName(String n){
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(30);
        obj.setName("tejal");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }
}
