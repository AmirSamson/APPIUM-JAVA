

public class ClassDemo {
    public static void main(String[] args){
        Dogs d1 = new Dogs();
        d1.age = 21;
        d1.name = "Toyger";
        System.out.println(d1.age);
        System.out.println(d1.name);
        d1.bark();
        d1.bark(false);
        d1.eat(); 

        /*
        RESULTS:

        21
        Toyger
        Dog is Barking
        Dog is Barking false
        Dog is eating

        */
    }
    
}

class Animal {
    String name;
    String sound;
    int age;
    public void eat(){
        System.out.println("Animal is  eating..");
    }
}

class Dogs extends Animal  {
    public void bark()
        {
            System.out.println("Dog is Barking");    
        }
    
    public void bark(boolean isBarking){
        System.out.println("Dog is Barking "+isBarking);
    }
    public void eat(){
        System.out.println("Dog is eating");
    }    
}
