class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        int mid = (m + n)/2;
        int l = 0, r = 0;
        int i = 0;

        while(l < m && r < n) {
            if(nums1[l] <= nums2[r]) {
                arr[i] = nums1[l];
                i++;
                l++;
            }
            else {
                arr[i] = nums2[r];
                i++;
                r++;
            }
        }
        while(l < m) {
            arr[i] = nums1[l];
            i++;
            l++;
        }
        while(r < n) {
            arr[i] = nums2[r];
            i++;
            r++;
        }
        if((m+n) % 2 == 0) {
            return (arr[mid] + arr[mid-1]) / 2.0;
        }
        return arr[mid];
    }
}