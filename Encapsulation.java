 class House {
   private int age;
   private String name;

   public int getAge(){
    return age;
   }
   public void setAge(int age){
    this.age = age;
   }
   public String getName(){
    return name;
   }
   public void setName(String name){
    this.name = name;
   }
}



public class Encapsulation {
    public static void main(String[] args) {
        House ob = new House();
        ob.setAge(77);
        ob.setName("abhishek");
        System.out.println(ob.getAge() + " : " + ob.getName());
    }
    
}
