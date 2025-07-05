class Solution:
    def findLucky(self, arr: List[int]) -> int:
        d={}
        for i in arr:
            if i not in d:
                d[i] = 1
            else:
                d[i] += 1
        lucky = -1
        for key in d:
            if key== d[key]:
                lucky = max(key,lucky)
        
        return lucky