public int[] twoSum(int[] nums, int target) {
    // First things first, we need a way to remember where we've seen each number.
    // We'll use a HashMap for this. Let's call it numMap.
    Map<Integer, Integer> numMap = new HashMap<>();
    
    // Next, let's figure out how many numbers we have in our array.
    int n = nums.length;

    // Now, let's go through each number one by one and see if we can find its pair.
    for (int i = 0; i < n; i++) {
        // First, let's figure out what number we need to add to the current number to reach our target.
        int complement = target - nums[i];
        // If we've already seen this needed number before, it means we've found our pair!
        if (numMap.containsKey(complement)) {
            // Awesome, we found it! Let's return the indices of the pair.
            return new int[] { numMap.get(complement), i };
        }
        // If not, let's remember this number and its index for future reference.
        numMap.put(nums[i], i);
    }

    // If we get through all numbers without finding a pair, well, we'll just return an empty array.
    return new int[] {};
}

// Time Complexity: O(n) - We're taking a single stroll through our array, no matter how big it is.
// Space Complexity: O(n) - In the worst case, we might have to remember each number and its position, which also grows linearly with the size of our array.
