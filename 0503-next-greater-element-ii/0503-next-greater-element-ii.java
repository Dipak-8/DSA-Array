class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[2 * nums.length];
        int index = 0;

        Stack<Integer> st = new Stack<>();
        int[] res = new int[2 * nums.length];
        int[] ans = new int[nums.length];

        for(int num : nums) {
            arr[index++] = num;
        }
        for(int num : nums) {
            arr[index++] = num;
        }

        for(int i=arr.length-1; i>=0; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            if(st.isEmpty())
                res[i] = -1;
            else
                res[i] = st.peek();
            st.push(arr[i]);
        }

        int k=0;
        while(k < ans.length) {
            ans[k] = res[k];
            k++;
        }
        return ans;
    }
}