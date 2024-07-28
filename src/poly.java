
public class poly {
        void overloading(String name){
            System.out.println("it is overriding"+name);
        }
        void overloading(int number){
            System.out.println("number is " + number);
        }

    public static void main(String[] args) {
        poly ne = new poly();
        ne.overloading("naveen");
        ne.overloading(234);
    }
}
