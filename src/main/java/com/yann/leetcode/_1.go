package leetcode

func twoSum1(nums []int, target int) []int {
	for i := 0; i < len(nums); i++ {
		for j := i + 1; j < len(nums); j++ {
			if nums[i]+nums[j] == target {
				return []int{i, j}
			}
		}

	}
	return []int{}
}

func twoSum_2(nums []int, target int) []int {
	var mapInt = make(map[int]int, len(nums))
	for k, v := range nums {
		mapInt[v] = k
	}

	for k, v := range nums {
		if j, ok := mapInt[target-v]; ok && k != j {
			return []int{k, j}
		}
	}
	return []int{}
}

func twoSum_3(nums []int, target int) []int {
	var mapInt = make(map[int]int, len[nums])
	for k, v := range nums {
		if j, ok := mapInt[target-v]; ok {
			return []int{k, j}
		}
		mapInt[v] = k
	}
	return []int{}
}
