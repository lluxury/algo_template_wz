package leetcode

import "math"

func reverse_7(x int) int {
	var rev int64
	for (x != 0) {
		rev = rev*10 + int64(x)%10
		x /= 10
		if (rev > math.MaxInt32 || rev < math.MinInt32) {
			return 0
		}
	}
	return int(x)
}

//还是不会写测试,补充一下