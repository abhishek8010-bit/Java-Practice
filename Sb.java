public class Sb {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb);
        System.out.println(sb.append(" World"));
        System.out.println(sb.capacity());
        System.out.println(sb.insert(5, " World"));

    }
    
}
