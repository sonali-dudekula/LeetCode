class Solution(object):
    def convert(self, s, numRows):
        if numRows == 1:
            return s
        else:
            list_of_strings = []
            r = -1
            i = 0
            for j in range(numRows):
                list_of_strings.append("")
            for k in range(len(s)):
                if r >= -1 and r < numRows-1 and i==0:
                    r += 1
                    list_of_strings[r] += s[k]
                else:
                    r -= 1
                    list_of_strings[r] += s[k]
                    i = 1
                    if r==0:
                        i = 0          
                 
            return ''.join(list_of_strings)
                    

        