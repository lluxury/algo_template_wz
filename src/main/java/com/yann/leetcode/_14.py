class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) == 0 or strs == None:
            return ''

        base = strs[0]

        for i in range(1, len(base) + 1):
            cs = base[:i]
            for s in strs:
                if s[:i]!=cs:
                    return base[:i-1]
        return base

