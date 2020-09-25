package cd.get.ready.algorithms;

public class ArrayRotator {

    public int[] rotateLeft(int[] arr, int n){
        for(int i = 0; i < n; i++) {
            int temp = arr[0];
            int j;
            for(j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }

        return arr;
    }


}
