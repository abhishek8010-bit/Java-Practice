package arrayQuestions;

import java.util.Scanner;

// Linear Search
public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nums[] = { 10, 30, 50, 20, 80, 90 };

        System.out.println("Enter the element to search:");

        int target = sc.nextInt();
        boolean found = false;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                System.out.println("Element:" + target + " found at index:" + i);
                found = true;
            }
        }
        if(!found){
                System.out.println("Element:" + target + " not found in an array");
            }

    }

}
