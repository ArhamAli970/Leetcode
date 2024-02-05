class Solution:
    def firstUniqChar(self, s: str) -> int: 
        
        a=str(set(s))
        k=0
        for i in s:
               if s.count(i)==a.count(i): 
                    return s.index(i) 
                    k=1
                    break
        if k!=1:
                   return -1