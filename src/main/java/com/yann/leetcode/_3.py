class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        tmp_list = []
        max_length =0

        for x in s:
            if x in tmp_list:
                tmp_list = tmp_list[tmp_list.index(x)+1:]
            tmp_list.append(x)
            max_length=max(max_length,len(tmp_list))
        return max_length  
		
# 最大不重复子串
# 思路1
# 构建哈希表,有相同值,表尾加入,表头一段踢出,python做是简单
# 补充, 需求是最长的长度值,需要记录
# 不停的构建唯一字符串,符合更新长度, 不符合剔除前段

# 过程
# 定义空列表 str_list
# 定义初始最长值 0
# 遍历 s 里面的字符
# 	如果列表里存在
# 	  生成新列表,排除首值到匹配值这段
# 	列表里不存在,在列表最后添加
# 	获取最大值,在默认最长值和列表长度中
# 遍历完成后,返回默认最大值