package arrayQuestions;

//Copy an array into another array;

public class Q6 {

    public static void main(String[] args) {
        
        int arr1[] = {1,2,3,4,5,6};
        int arr2[] = new int[arr1.length];

        for(int i=0; i<arr1.length; i++){
            arr2[i] = arr1[i];
        }

        for(int n : arr2){
            System.out.println(n);
        }
    }
}
