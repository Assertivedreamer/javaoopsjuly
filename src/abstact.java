abstract class abs1{
}
abstract class abs2 extends abs1{

}

public class abstact extends abs2{
    void abs2(){
        System.out.println("abstract2");
    }
    void abs1(){
        System.out.println("abstract1");
    }
    public static void main(String[] args) {
       abstact ne = new abstact();
        ne.abs2();
        ne.abs1();
    }
}
