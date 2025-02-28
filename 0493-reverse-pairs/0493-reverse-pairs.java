class Solution {
    void merge(int arr[], int low, int middle, int high) {
        int[] temp = new int[high-low+1];
        int left = low;
        int right = middle+1;
        int k = 0;
        while(left <= middle && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[k++] = arr[left];
                left++;
            }
            else {
                temp[k++] = arr[right];
                right++;
            }
        }
        while(left <= middle) {
            temp[k++] = arr[left];
            left++;
        }
        while(right <= high) {
            temp[k++] = arr[right];
            right++;
        }
        for(int i=low; i<=high; i++) {
            arr[i] = temp[i-low];
        }
    }

    int countPairs(int arr[], int low, int middle, int high) {
        int count = 0;
        int right = middle + 1;
        for(int i=low; i<=middle; i++) {
            while(right <= high && arr[i] > (long)2*arr[right])    
                right++;
            count += right - (middle + 1);
        }
        return count;
    }

    int mergeSort(int arr[], int l, int r) {
        int count = 0;
        if(l >= r) return count;
        int mid = (l+r)/2;
        count += mergeSort(arr, l, mid);
        count += mergeSort(arr, mid+1, r);
        count += countPairs(arr, l, mid, r);
        merge(arr, l, mid, r);
        return count;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}