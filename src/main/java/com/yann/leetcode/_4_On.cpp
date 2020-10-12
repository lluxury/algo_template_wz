class Solution{
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2){
        vector<int> merge;
        int m = nums1.size(), n=nums2.size();
        merge.reserve(m + n);
        int i = 0, j = 0;

        for(; i != m && j !=n;){
            if (nums1[i] <= nums2[j]){
                merge.push_back(nums1[i++]);
            } else {
                merge.push_back(nums2)[j++];
            }
        }
        while (i !=m){
            merge.push_back(nums1[i++]);
        }
        while (j !=n){
            merge.push_back(nums2[j++]);
        }
        int median = (m + n -1) / 2;
        if((m + n) % 2){
            return merge[median];
        } else {
            return (double(merge[median])+ merge[median + 1]) / 2;
        }
    }
};

// O(m+n)
