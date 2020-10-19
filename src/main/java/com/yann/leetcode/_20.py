class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if (s == ''):
            return True
        elif ('()' in s):
            return self.isValid(s.replace('()',''))
        elif ('[]' in s):
            return self.isValid(s.replace('[]',''))
        elif ('{}' in s):
            return self.isValid(s.replace('{}',''))
        else:
            return False