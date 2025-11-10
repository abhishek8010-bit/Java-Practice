
//Largest Element in an Array


public class Q2 {
    public int largestElement(){
        int num[] = {1,2,2,3,5,7,11};
        int result = 0;
        for(int i=0; i<num.length -1; i++){
            if(num[i] < num[i+1]){
                result = num[i+1];
                // System.out.println(result);
            }
            // else{
            //     System.out.println("error");
            // }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Q2 sc = new Q2();
        int res = sc.largestElement();
        System.out.println(res);
    }


    
}
