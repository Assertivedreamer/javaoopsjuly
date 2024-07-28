
public class encapulation {
    String name;
    int number;
    void encapulation(String name,int number){
        System.out.println(this.name=name);
        System.out.println(this.number= number);
    }
   void setName(String name){
       this.name=name;
   }
   void setNumber(int number){
       this.number = number;
   }
   String getName(){
       return name;
   }
   int getNumber(){
       return number;
   }

    public static void main(String[] args) {
        encapulation n = new encapulation();
        n.encapulation("ramesh",2);
//        n.setName("ramesh");
//        n.setNumber(2);
//
        System.out.println(n.getName()+n.getNumber());
    }

}
