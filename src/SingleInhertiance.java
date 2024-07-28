class SingleInhertianceparent {
    void SingleInhertianceparent(){
        System.out.println("single inheritance");
    }
}
public class SingleInhertiance extends SingleInhertianceparent{
    public static void main(String[] args) {
        SingleInhertiance si = new SingleInhertiance();
        si.SingleInhertianceparent();
    }
}


