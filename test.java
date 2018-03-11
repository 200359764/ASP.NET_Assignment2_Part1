package pets;

/**
 *
 * @author seunghwankim
 */
public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("hey","hy");
        System.out.println(dog.speak());
        
        Cat cat = new Cat("hey", "hy");
        System.out.println(cat.speak());
        
        Duck duck = new Duck("hey", "hy");
        System.out.println(duck.speak());
    }
    
}
