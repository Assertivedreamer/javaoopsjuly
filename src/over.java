class Animal{
    void bark() {
        System.out.println("animal is barking");
    }
}
class Cat extends Animal{
    void bark(){
        System.out.println("cat is barking");
    }
}
public class over {
    public static void main(String[] args) {
        Animal ne = new Animal();
        ne.bark();
        Cat cat = new Cat();
        cat.bark();
    }
}
