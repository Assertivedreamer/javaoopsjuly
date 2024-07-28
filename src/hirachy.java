class hirarchyparent {
    void hirarchyparent(){
        System.out.println("hirarchyparent inheritance");
    }
}
class hirarchychild1 extends hirarchyparent {
    void hirarchychild1(){
        System.out.println("hirarchy child1 inheritance");
    }
}
class hirachychild2 extends hirarchyparent {
    void hirarchychild2(){
        System.out.println("hirarchy child2 inheritance");
    }
}
public class hirachy {
    public static void main(String[] args) {
        hirachychild2 see = new hirachychild2();
        hirarchychild1 se= new hirarchychild1();
        see.hirarchychild2();
        see.hirarchyparent();
        se.hirarchychild1();
    }
}

