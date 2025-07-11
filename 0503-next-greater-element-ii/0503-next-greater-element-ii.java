class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums.length];

        for(int i=2*n; i>=0; i--) {
            while(!st.isEmpty() && st.peek() <= nums[i % n])
                st.pop();
            if(i < n) {
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(nums[i % n]);
        }
        return ans;
    }
}