class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] answer = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = nums2.length-1; i >=0; i--) {
            while(!st.isEmpty() && st.peek() <= nums2[i]) 
                st.pop();
            if(st.isEmpty())
                map.put(nums2[i], -1);
            else
                map.put(nums2[i], st.peek());
            st.push(nums2[i]);
        }

        for(int i=0; i<nums1.length; i++) {
            answer[i] = map.get(nums1[i]);
        }
        return answer;
    }
}