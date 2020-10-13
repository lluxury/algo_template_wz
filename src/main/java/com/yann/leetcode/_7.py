# Given a 32-bit signed integer, reverse digits of an integer.
#
# Note:
# Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

# Example 1:
#
# Input: x = 123
# Output: 321
# Example 2:
#
# Input: x = -123
# Output: -321
# Example 3:
#
# Input: x = 120
# Output: 21
# Example 4:
#
# Input: x = 0
# Output: 0

class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """

        val = 0
        if (x < 0):
            sign = -1
            x = -x
        else:
            sign = 1
        while (x > 0):
            val = val * 10 + x % 10
            x = x / 10
            print(val)
        val = val * sign
        if (val >= -2147483648 and val <= 2147483647):
            return val
        else:
            return 0


    def reverse(self,x):
        s = cmp(x,0)
        x = s*int(str(abs(x)))[::-1]
        return x if x.bit_length()< 32 else 0
    # 妖孽的解法，不过 cmp python3 没有了