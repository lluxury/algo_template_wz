package leetcode

func getMedianNumber(length int) int {
	//return (length - 1/2) + 1 //
	return (length - 1)/2 + 1 // 打表的规律
}

func findMedianSortedArrays(nums1 []int, nums2 []int) float64 {
	num1Len, num2Len := len(nums1), len(nums2)
	median := getMedianNumber(num1Len + num2Len)

	if (num1Len+num2Len) % 2 == 0 {
		//return float64(findKth(nums1, nums2, num1Len, num2Len, median, 0, 0) + findKth(nums1, nums2, num1Len, num2Len, median+1, 0, 0) / float64(2))  注意括号位置
		return float64(findKth(nums1, nums2, num1Len, num2Len, median, 0, 0) + findKth(nums1, nums2, num1Len, num2Len, median+1, 0, 0)) / float64(2)
	} else {
		return float64(findKth(nums1, nums2, num1Len, num2Len, median, 0, 0))
	}
}

func findKth(num1, num2 []int, num1Len, num2Len, off int, start_1, start_2 int) int {
	if num1Len > num2Len {
		return findKth(num2, num1, num2Len, num1Len, off, start_2, start_1)
	}
	if num1Len == 0 {
		return num2[off-1]
	}
	if off == 1 {
		//return min(num1[start_1, num2[start_2]]) // 同样,分解不到位
		return min_4(num1[start_1], num2[start_2])
	}
	a := min_4(off/2, num1Len)
	b := off - a

	if num1[a+start_1-1] <= num2[b+start_2-1] {
		return findKth(num1, num2, num1Len-a, num2Len, off-a, start_1+a, start_2)
	} else {
		return findKth(num1, num2, num1Len, num2Len-b, off-b, start_1, start_2+b)
	}
}

func min_4(s ...int) int {
	switch len(s) {
	case 0:
		panic("min_4")
	case 1:
		return s[0]
	case 2:
		if s[0] < s[1] {
			return s[0]
		}
		return s[1]
	default:
		return min_4(append([]int{min_4(s[0], s[1])}, s[2:]...)...)
	}
}