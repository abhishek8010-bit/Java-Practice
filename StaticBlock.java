class Mobile{
    public void show(){
    System.out.println("i am constructor");
   } 

   static{
    System.out.println("i am static");
   }
}



public class StaticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile ob = new Mobile();
        ob.show();
       // Class.forName("Mobile");
    }
    
}
