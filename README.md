# Two Sum

Original Problem: [LeetCode - Two Sum](https://leetcode.com/problems/two-sum)

## Description

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

**Example 1:**

Input: nums = [2,7,11,15], target = 9

Output: [0,1]

Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

**Example 2:**

Input: nums = [3,2,4], target = 6

Output: [1,2]

**Example 3:**

Input: nums = [3,3], target = 6

Output: [0,1]
 
Constraints:

`2 <= nums.length <= 104`

`-109 <= nums[i] <= 109`

`-109 <= target <= 109`

*Only one valid answer exists.*

**Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?**

## Solution

**You can check the solutions in different programming languages [here](https://github.com/arthur404dev/leetcode-01-two-sum/tree/main/solutions).**

```python3
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
```

## Contribution

If you want to contribute a soultion in another programming language, feel free to create a Pull Request following the convention:

1. Files should be named with the pattern: `[language-name]-solution.[language-extension]`

    *E.g: For a golang submission the name should be either: `go-solution.go` or `golang-solution.go`*

2. Branches should be named using the pattern: `feat:[language-name]-solution`

    *E.g: For a golang submission the name of the branch should be: `feat:golang-solution`*

3. Feel free to use the [Issues](https://github.com/arthur404dev/leetcode-01-two-sum/issues) section as a discussion forum for each topic.