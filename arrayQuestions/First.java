package arrayQuestions;

//find max and min element in an array:
public class First {
    public static void main(String[] args) {
        
        int nums[] = {2,3,1,6,9};
        int max = nums[0];
        int min = nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            else{
                min = nums[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
    
}
