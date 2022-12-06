public class Demo {
    int nums[][] = {{12, 34, 56, 78, 90}, {41, 62, 73, 89, 46}, {47, 83, 95, 47, 86}, {14, 26, 987, 59, 74}};
    public void display(){
        //rows
        for (int i = 0; i<4; i++){
            //columns
            for (int j = 0; j<5; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }

    public int[] linearSearch(int arr[][], int target){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
