class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if  x < 0:
            # return false
            return False
        elif x == 0:
            return True
        elif x % 10 == 0:
            return False

        reversed = 0
        while x > reversed:
            digit = x % 10
            reversed *= 10
            reversed += digit
            x /= 10

        # return (x == reversed || x == reversed / 10)
        return x == reversed or x == reversed / 10

# python 并不是无规则的，不能用 false，0代表失败
# 不能用 || 代表逻辑运算符