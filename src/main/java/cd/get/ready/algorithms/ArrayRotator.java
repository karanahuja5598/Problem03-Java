package cd.get.ready.algorithms;

import java.util.Arrays;

public class ArrayRotator {

    public int[] rotateLeft(int[] arr, int n){
        for(int i = 0; i < n; i++) {
            int[] newArray = Arrays.copyOfRange(arr,1,arr.length + 1);
            newArray[arr.length - 1] = arr[0];
            arr = newArray;
        }

        return arr;
    }


}
