package arrayQuestions;

//sum and average of elements in an array:
public class Second {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int sum =0;
        float avg = 0;

        for(int num : nums){
            sum = sum + num;
            avg = sum/5;
        }
        System.out.println(sum);
        System.out.println(avg);
    }
    
}
