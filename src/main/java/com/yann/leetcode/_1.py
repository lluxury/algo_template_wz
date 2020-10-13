
class Solution(object):
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        wanted = {}
        # for i, v in enumerate(nums):
        for i in range(len(nums)):
            n = nums[i]
            if n in wanted:
                return [wanted[n], i]
            else:
                wanted[target-n] = i
        return []

# 思路1:
# 类似补码, 遍历列表, 找目标的差值是/否存在

# 流程
# 参数,num 整数list , target整数 ;输出同样
# 建立空字典 seen
# 使用 i 和 v 枚举 nums
#     定义 remaining 为 target 减去 v
#     如果在字典中存在
#         就反回字典值 和 i
#       否则返向构造字典, k[v] = i
# 再否则返回空
# 使用 else 更规范一些

# 思路2:
# 两次遍历, 如果和为目标,则输出, 差

# 思路3:
# 弹出成员, 符合补码拼接索引
        for i in range(len(nums)):
            a = target - nums.pop(0)
            if a in nums:
                return [i, nums.index(a)+i+1]
# 太巧妙了,学不来, nums.index(a)是元素的变化后位置, i 是弹出的个数, 1是补啥? 
# 只能打表确认,不过复杂度高了, 不推荐