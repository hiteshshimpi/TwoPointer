package TwoPointer;

import java.util.Arrays;
import java.util.Collections;

public class LargestThreeProduct {
    public static void main(String[] args) {
        int arr[]={-1,-2,-3};
       int product= maximumProduct(arr);
        System.out.println(product);
    }

    public static int maximumProduct(int[] nums) {
    int product=1;
    if(nums.length<3)
    {
        for (int i=0;i<nums.length;i++)
        {
            product=product*nums[i];
        }
    }
    else
    {
        int i = nums.length-3;
        for (int j =i;j<nums.length;j++)
        {
            product =product*nums[j];
        }
    }

return product;
    }
}
