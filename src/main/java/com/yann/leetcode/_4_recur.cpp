class Solution{
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2){
        const int m = nums1.size(), n=nums2.size();
        int median = (m + n - 1) /2 + 1;
        if ((m + n) % 2){
            return find(nums1,m,nums2,n,median);
        } else{
            return (double(find(nums1, m, nums2, n, median)) + find(nums1, m, nums2, n, median + 1)) / 2;
        }
    }

private:
    int find(vector<int> &nums1, int m, vector<int> &nums2, int n, int off, int mStart = 0, int nStart = 0) {
        if (m > n){
          return find(nums2, n, nums1, m, off, nStart, mStart);  
        }

        if (!m){
            return nums2[off - 1];
        }

        if (1 == off){
            // return min(nums1[mStart],nums2[nstart]);
            return min(nums1[mStart], nums2[nStart]);
        }

        int a = min(off / 2, m);
        int b = off -a;
        if (nums1[a + mStart -1] <= nums2[b + nStart -1]){ return find(nums1, m - a, nums2, n, off - a, mStart + a, nStart);
        } else {
            return find(nums1, m, nums2, n - b, off - b, mStart, nStart + b);
        }
}

};

