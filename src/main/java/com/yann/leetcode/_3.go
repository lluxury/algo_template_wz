package leetcode

func lengthOfLongestSubstring(s string) int {
	m := make(map[byte]bool)
	l := 0

	//for i, j := 0; i < len(s) && j < len(s); {
		for i, j := 0, 0; i < len(s) && j < len(s); {
			if exist, ok := m[s[j]]; ok && exist {
				m[s[i]] = false
				i++
			} else {
				m[s[j]] = true
				j++
				if j-i > l {
					l = j - i
				}
			}
		}
	}
	return l
}
