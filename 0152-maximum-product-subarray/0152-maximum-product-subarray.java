class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prefixMul = 1;
        int suffixMul = 1;
        for(int i=0; i<nums.length; i++) {
            if(prefixMul == 0)  prefixMul = 1;
            if(suffixMul == 0)  suffixMul = 1;
            prefixMul *= nums[i]; 
            suffixMul *= nums[nums.length-1-i];
            max = Math.max(max, Math.max(prefixMul, suffixMul)); 
        }
        return max;
    }
}