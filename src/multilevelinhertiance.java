 class multilevelinhertianceparent {
        void multilevelinhertianceparent(){
            System.out.println("multilevel parent inheritance");
        }
    }
 class multilevelinhertiancechild extends multilevelinhertianceparent {
     void multilevelinhertiancechild(){
         System.out.println("multilevel child1 inheritance");
     }
 }
    public class multilevelinhertiance extends multilevelinhertiancechild  {
        public static void main(String[] args) {
            multilevelinhertiance si = new multilevelinhertiance();
            si.multilevelinhertianceparent();
            si.multilevelinhertiancechild();
        }
    }

