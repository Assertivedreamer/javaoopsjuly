class hybridgrandfather {
    void hybridgrandfather(){
        System.out.println("hybrid father inheritance");
    }
}
class hybridparent extends hybridgrandfather {
    void hybridparent(){
        System.out.println("hybrid parent inheritance");
    }
}
class hybridchild1 extends hybridparent {
    void hybridchild1(){
        System.out.println("hybrid child1 inheritance");
    }
}
class hybridchild2 extends hybridparent {
    void hybridchild2(){
        System.out.println("hybrid child2 inheritance");
    }
}
public class hybridinhertiance {
    public static void main(String[] args) {
        hybridchild2 pa = new hybridchild2();
        pa.hybridchild2();
        pa.hybridparent();
        pa.hybridgrandfather();
    }
}
