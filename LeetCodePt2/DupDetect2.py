from typing import List


def containsNearbyDuplicate(nums: List[int], k: int) -> bool:
    seen = {}

    for i in range(len(nums)):
        if nums[i] in seen and abs(i - seen[nums[i]]) <= k:
            return True
        seen[nums[i]] = i
    return False

print(containsNearbyDuplicate([1,2,3,1,2,3],2))
