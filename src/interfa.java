interface inf1{

}
interface inf2 {

}

public class interfa implements inf2,inf1 {
    void inf1(){
        System.out.println("inf1");
    }
    void inf2(){
        System.out.println("inf2");
    }
    public static void main(String[] args) {
        interfa nevv = new interfa();
        nevv.inf1();
        nevv.inf2();
    }
}
