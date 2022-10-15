// Question:
// Given an array "nums". We define a running sum of an array as "runningSum[i]" 
// = Sum(nums[0] ... nums[i])

//Return the running sum of nums.

//EX: Input: nums = [1,2,3,4]
//    output: [1,3,6,10]

//constraints: 1 <= nums.length <= 1000 & -10^6 = nums[i] <= 10^6
 // CODE:

class Solution {
    public int [] runningSum(int[]nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }
}