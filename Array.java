public class Array {
    public static void main(String1[] args) {
        // int nums[] = {1,3,5,7};
        // for(int i=0; i<4; i++){
        //     System.out.println(nums[i]);
        // }
        

        // int nums[][] = {{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12}};

        //    for(int num[] : nums){               //enhanced loop;
        //     for(int value : num){
        //         System.out.print(value + " ");
        //     }
        //     System.out.println();
        //    }     
        
        
        int nums [][] = new int[3][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<4; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i=0; i<3;i++){
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
