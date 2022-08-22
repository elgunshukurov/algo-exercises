package generalQuizes;

import java.util.*;
import java.util.stream.Collectors;

public class Patterns {
    public static void main(String[] array) {
        List<Integer> ar =  Arrays.asList(1,2,3,3,3,4,5);


        staircase(4);
    }

    public static void staircase(int n) {
        // Write your code here
        for (int i = 1; i <= n; i++) {
            for (int j = n; i < j; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            if(i!=n)System.out.println("");
        }

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*  [3, 1]   [5, 2, 8]  10
         * Write your code here.
         */
        int sum = 0;
        int maxSum = 0;
        int kl = keyboards.length; //2
        int dl = drives.length; //3
        System.out.println(kl + " " + dl);

        for (int i = 0; i < kl; i++) {
            for (int j = 0; j < dl; j++) {
                if (kl > dl) {
                    sum = keyboards[i] + drives[j];
                    System.out.println("sum=" + sum + "   maxSum=" + maxSum + "   b=" + b);
                    if (sum > maxSum && sum < b) {
                        maxSum = sum;
                    }
                } else {
                    sum = keyboards[j] + drives[i];
                    System.out.println("sum=" + sum + "   maxSum=" + maxSum + "   b=" + b);
                    if (sum > maxSum && sum < b) {
                        maxSum = sum;
                    }

                }
            }

//        if(kl>dl){
//            for (int i = 0; i < kl; i++) {
//                for (int j = 0; j < dl; j++) {
//                    sum = keyboards[i] + drives[j];
//                    System.out.println("sum="+sum+"   maxSum="+maxSum+"   b="+b);
//                    if(sum>maxSum && sum<b){
//                        maxSum = sum;
//                    }
//                }
//            }
//        } else{
//            for (int i = 0; i < dl; i++) {
//                for (int j = 0; j < kl; j++) {
//                    sum = keyboards[j] + drives[i];
//                    System.out.println("sum="+sum+"   maxSum="+maxSum+"   b="+b);
//                    if(sum>maxSum && sum<b){
//                        maxSum = sum;
//                    }
//                }
//            }
//        }
        }
        if(maxSum==0) return -1;
        return maxSum;
    }
    static long aVeryBigSum(List<Long> ar){
        return ar.stream().reduce(0L,Long::sum);
    }

    public static int equalizeArray(List<Integer> arr) {
        // Write your code here
        int frequency=0;



        HashMap<Integer, Integer> elementCountMap = new HashMap<>();
        for (int i : arr)
        {
            if (elementCountMap.containsKey(i))
            {
                elementCountMap.put(i, elementCountMap.get(i)+1);
            }
            else
            {
                elementCountMap.put(i, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entrySet = elementCountMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet)
        {
            if(entry.getValue() > frequency)
            {
                frequency = entry.getValue();
            }
        }
        return arr.size()-frequency;
    }

}
