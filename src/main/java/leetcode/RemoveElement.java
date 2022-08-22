package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        Animal animal = new Animal();
        animal.name="Dog";
        String s = " string";
        System.out.println(Arrays.toString(nums));
        System.out.println(val);
        System.out.println(animal.name);
        System.out.println(s);
        System.out.println("----------------------------------");

        System.out.println(removeElement(nums, val, animal, s));
        System.out.println("----------------------------------");
        System.out.println(Arrays.toString(nums));
        System.out.println(val);
        System.out.println(animal.name);
        System.out.println(s);

    }

    public static int removeElement(int[] nums, int val, Animal animal, String s) {
        int k = 0;

        animal.name = "Cat";
        s = " char";

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        val = 5;

        return 0;
    }
}
