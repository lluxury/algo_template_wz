package leetcode

func convert(s string, numRows int) string {
	if s == "" || numRows == 1{
		return s
	}

	var result = make([][]byte,numRows)

	index :=0
	add := -1
	for k := 0; k < len(s); k++ {
		if index == numRows -1 || index == 0{
			// index += add
			add = -add
		}

		result[index] = append(result[index], byte(s[k]))
		index += add
	}

	var data [] byte
	for _, v := range result {
		data = append(data,v...)
	}
	return string(data)
}