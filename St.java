public class St {
    public static void main(String[] args) {
        
       
        String s1 = "Abhishek";
        String s2 = new String("Chauhan"); 
        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.hashCode());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.equalsIgnoreCase("abhishek"));
        System.out.println(s1.equals("abhishek"));
        System.out.println(s1.concat(s2));
        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf("i"));
        System.out.println(s1.compareTo("Abhi"));
        System.out.println(s1.replace(s1, s2));
        System.out.println(s1.replace( 'A' ,  'b'));
    }
    
}
