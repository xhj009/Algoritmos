package Leetcode217ContainsDuplicate;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        int nElementos = nums.length;
        HashSet<Integer> numeros = new HashSet<>();

        for (int i = 0; i < nElementos; i++) {
            if (numeros.contains(nums[i])) {
                return true;
            }
            numeros.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));

    }
}
