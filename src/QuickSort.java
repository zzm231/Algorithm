public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {24,43,56,76,23,57,21,9,6,34};
        quickSort(arr,0,arr.length - 1);
        for (int i : arr){
            System.out.print(i+"\t");
        }
    }

    private static void quickSort(int[] arr,int left,int right){
        if (left < right){
            // 寻找基准数据的正确索引
            int index = getIndex(arr,left,right);

            // 进行迭代对index之前和之后的数组进行相同的操作使数组比那的有序
            quickSort(arr,left,index - 1);
            quickSort(arr,index + 1,right);
        }
    }

    private static int getIndex(int[] arr,int left,int right){
        // 基准数据
        int temp  = arr[left];
        while (left < right){
            // 当队尾的元素大于等于基准数据时 向前挪动right指针
            while (left < right && arr[right] >= temp){
                right --;
            }

            // 如果队尾的元素小于temp了，需要将其复制给left
            arr[left] = arr[right];

            // 当队首的元素小于等于temp时 向前挪动left指针
            while (left < right && arr[left] <= temp){
                left ++;
            }
            // 当队首元素大于temp时 需要将其赋值给right
            arr[right] = arr[left];
        }
        // 跳出循环时left和right相等 此时left或者right就是temp的正确索引位置
        arr[left] = temp;
        // 返回temp的正确位置
        return left;
    }
}
