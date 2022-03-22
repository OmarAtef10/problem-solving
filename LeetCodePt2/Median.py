class Solution:
    def findMedianSortedArrays(self, nums1: list[int], nums2: list[int]) -> float:
        num3 = nums1+nums2
        num3.sort()
        length=len(num3)
        if length%2!=0:
            return num3[length//2]
        else:
            return (num3[length//2-1]+num3[length//2])/2




if __name__ == '__main__':
    nums1 = [1,3]
    nums2 = [2]
    print(Solution.findMedianSortedArrays(Solution,nums1,nums2))

