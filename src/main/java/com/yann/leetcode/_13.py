# Example 1:
#
# Input: s = "III"
# Output: 3
# Example 2:
#
# Input: s = "IV"
# Output: 4
# Example 3:
#
# Input: s = "IX"
# Output: 9
# Example 4:
#
# Input: s = "LVIII"
# Output: 58
# Explanation: L = 50, V= 5, III = 3.
# Example 5:
#
# Input: s = "MCMXCIV"
# Output: 1994
# Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        counter = 0
        special = {
            'IV':4,
            'IX':9,
            'XL':40,
            'XC':90,
            'CD':400,
            'CM':900,
        }
        normal = {
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000
        }

        for char,num in special.items():
            if char in s:
                counter += num
                s = s.replace(char, '')
                if s == '':
                    return counter

        for char, num in normal.items():
            if char in s:
                counter += num*s.count(char)
                s = s.replace(char,'')
                if s == '':
                    return counter
        return counter