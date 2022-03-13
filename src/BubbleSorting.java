public class BubbleSorting {
    public static void main(String[] args) {
        int[] nums = {99,98,97,96,100,101,103,102};

        // 冒泡排序
        for (int i = 0; i < nums.length -1 ; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                int temp = 0;
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        System.out.println("排序后的数组:");
        for (int i:nums){
            System.out.print(i+"\t");
        }
    }
}
