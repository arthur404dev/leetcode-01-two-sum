def twoSum(self, nums: List[int], target: int) -> List[int]:
    # First, we create an empty dictionary to keep track of numbers we've seen and their positions.
    numMap = {}
    # Let's find out how many numbers we have to work with.
    n = len(nums)

    # Now, we'll look at each number one by one.
    for i in range(n):
        # For each number, let's figure out what number we need to add to it to reach our target.
        complement = target - nums[i]
        # If this needed number is already in our dictionary, we've found our pair!
        if complement in numMap:
            # We return the position of the complement and the current position.
            return [numMap[complement], i]
        # If we haven't found the pair yet, let's remember this number and its position.
        numMap[nums[i]] = i

    # If we get through all numbers without finding a pair, we'll just return an empty list.
    return []  

# Time Complexity O(n) - We're taking a single stroll through our list, no matter how big it is. So, the time it takes grows linearly with the size of the list.
# Space Complexity O(n) - In the worst case, we might have to remember each number and its position, which also grows linearly with the size of our list.

