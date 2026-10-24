class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        for s in strs:
            sortedS = ''.join(sorted(s))
            # print("sortedS:",sortedS)
            res[sortedS].append(s)
            # print("res[sortedS]:",res[sortedS])
        return list(res.values())
        # return res.values()
        