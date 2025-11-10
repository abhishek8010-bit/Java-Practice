
//  class Calculator {
//     int a;

//     public int add(){
//         int num1 = 5;
//         int num2 = 7;
//         int r = num1 + num2;
//         return r;
//     }

// }

// public class Demo {
//     public static void main(String Argu[]) {

//         Calculator sc = new Calculator();
//         int result = sc.add();
//         System.out.println(result);
//     }

// }

class Calculator {

    public int add(int n1, int n2) {

        int r = n1 + n2;
        return r;
    }

}

public class Demo {
    public static void main(String Argu[]) {

        int num1 = 5;
        int num2 = 4;

        Calculator sc = new Calculator();
        int result = sc.add(num1, num2);
        System.out.println(result);
    }

}