class Solution(object):
    def searchMatrix(self, matrix, target):
        output = None
        for i in matrix:
            for j in range(len(i)):
                if target == i[j]:
                    output = True
                    return output
        if output != True:
            return False
            
        