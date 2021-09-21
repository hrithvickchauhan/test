import java.util.Arrays;
import java.util.Properties;

public class Solution {

    public static void main(String[] args) {
        int arr[] = {2,5,5,6,45,14,3,45,12,5,12};

        int[] finalArray = removeDuplicateElements(arr);

        for(int i=0; i<finalArray.length; i++){
            System.out.println(finalArray[i]);
        }

//        Properties p = System.getProperties();
//        p.setProperty("p", "s");
//        String s = p.getProperty("argProp") + " ";
//        s+= p.getProperty("p");
//        System.out.println(s);
    }

    private static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int[] removeDuplicateElements(int arr[]){
        int n = arr.length;
        if (n==0 || n==1){
            return arr;
        }

        int count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j < arr.length; j++){
                if(i != j && arr[i] == arr[j] && arr[i] !=0) {
                    arr[j] = 0;
                    count ++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }

        int[] finalArray = new int[arr.length- count - 1];
        for(int i =0; i < finalArray.length; i++){
            finalArray[i] = arr[i];
        }
        return finalArray;
    }

    private static boolean frequencyInSortedArray(int[] arr) {
        int ele = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (i != 0 && arr[i] == ele)
                continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            System.out.println("frequency of " + arr[i] + " is : " + count);
            ele = arr[i];
        }
        return true;
    }

    private static int maximumDifference(int[] arr) {
        int maxDiff = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] > maxDiff) {
                    maxDiff = arr[j] - arr[i];
                }
            }

        }
        return maxDiff;
    }

    private static int[] leadersInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                System.out.println(arr[i] + " is a leader");
            }
        }
        return arr;
    }

    private static int[] leftRotateArray(int[] arr, int d) {
        int res = arr[0];
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        arr[arr.length - 1] = res;
        return arr;

    }

    private static int[] moveZeroesToEnd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }

        }
        return arr;
    }

    private static boolean printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return false;
    }

    private static int findSecondLargest(int arr[]){
        int largest = arr[0];
        int second = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            } else{
                if(arr[i] > second){
                    second = arr[i];
                    int o = 5/0;
                }
            }
        }

        return second;
    }
}