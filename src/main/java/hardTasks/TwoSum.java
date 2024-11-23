package hardTasks;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,7,11};
        int target=9;
        System.out.println(Arrays.toString(method(nums,target)));//index
    }

        public static int[] method(int[] nums, int target) {
            int[] newnum=new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i+1; j < nums.length ; j++) {
                    if (target == nums[i] + nums[j]) {
                        newnum[0]=i;
                        newnum[1]=j;
                        return newnum;
                    }
                }
            }
            return new int[0];
        }
    }

