 class Add {

    public void message(){
        System.out.println("Hello");
    }

    public String getMePen(){
        

         return "Pen";

    }


    
} 

public class Methods {
    public static void main(String[] args) {

        
        Add md = new Add();

        md.message();
       String str = md.getMePen();
       System.out.println(str);
        
    }
    
}
