class Solution:

    def encode(self, strs: List[str]) -> str:
        # enc = []
        enc = ""
        for word in strs:
            # enc.append(word)
            # enc.append('|')
            enc = enc + word
            enc = enc + '||||'
        return(enc)
        # print(enc)

    def decode(self, s: str) -> List[str]:
        if s == '':
            return []
        # print(s)
        # s = s.replace('|', ' ')
        # # print(s)
        s = s[:-4]
        # s = list(s)
        res = s.split('||||')
        print(res)
        return res
