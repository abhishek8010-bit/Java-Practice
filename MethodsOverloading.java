 class Calculator {
    public int add(int n1, int n2){

        return n1 + n2;
    }
    public double add(double n1, int n2){

        return n1 + n2;
    }

    
}

public class MethodsOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        
        int result = obj.add(10,20);
        double result1 = obj.add(10,20);
        
        System.out.println(result);
        System.out.println(result1);
    }
    
}
