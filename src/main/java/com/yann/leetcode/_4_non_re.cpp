class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        const int m = nums1.size(), n = nums2.size();
        int median = (m + n - 1) / 2 + 1;
        if ((m + n) % 2) {
            return find(&nums1, m, &nums2, n, median);
        } else {
            return (double(find(&nums1, m, &nums2, n, median)) + find(&nums1, m, &nums2, n, median + 1)) / 2;
        }
    }

private:
//    int find(vector<int> *nums1, int m, vector<int> *&nums2, int n, int off) { 自己写错了
    int find(vector<int> *nums1, int m, vector<int> *nums2, int n, int off) {
        int mStart = 0, nStart = 0;
        while (true) {
            if (m > n) {
                swap(nums1, nums2);
                swap(m, n);
                swap(mStart, nStart);
            }

            if (!m) {
                return (*nums2)[off - 1];
            }

            if (1 == off) {
                return min((*nums1)[mStart], (*nums2)[nStart]);
            }

            int a = min(off / 2, m);
            int b = off - a;
            if ((*nums1)[a + mStart - 1] <= (*nums2)[b + nStart - 1]) {
                m -= a;
                off -= a;
                mStart += a;
            } else {
                n -= b;
                off -= b;
                nStart += b;
            }
        }
    }
};
//纸上画一下, 看怎么改写的,目测直接操作地址