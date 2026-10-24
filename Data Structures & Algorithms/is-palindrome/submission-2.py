class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        s = ''.join(filter(str.isalnum,s))
        # print(s)
        pal = ''.join(reversed(s))
        # print(pal)
        if pal == s:
            return True
        else:
            return False