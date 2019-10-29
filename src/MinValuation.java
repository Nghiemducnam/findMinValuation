public class MinValuation {
    public static void main(String[] args) {
        int arr [] = {4,8,5,12,8,6,0};
        int index = minValue(arr);
        System.out.println("the smallest element in array is: " + arr[index]);
    }

    public static int minValue(int array []) {
        int min = array[0];
        int index = 0;
        for(int i =1; i<array.length; i++){
            if (min>array[i]) {
                min = array[i];
                index = i;
            }
        } return index;
    }
}
