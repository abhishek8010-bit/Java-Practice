package arrayQuestions;


// count even and odd elements in an array.
public class Q3 {

    public static void main(String[] args) {
        
        int nums[] = {1,2,3,4,5,6};
        int even = 0;
        int odd = 0;
        for(int num : nums){
            if(num%2==0){
                even ++;
            }
            else{
                odd ++;
            }
        }
        System.out.println("even:" + even);
        System.out.println("odd:" + odd);
    }
    
}
