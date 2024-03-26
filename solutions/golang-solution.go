package main

func twoSum(nums []int, target int) []int {
	// First things first, we need a way to remember where we've seen each number.
	// We'll use a map for this. Let's call it numMap.
	numMap := make(map[int]int)

	// Now, let's go through each number one by one and see if we can find its pair.
	for i, num := range nums {
		// First, let's figure out what number we need to add to the current number to reach our target.
		complement := target - num
		// If we've already seen this needed number before, it means we've found our pair!
		if index, exists := numMap[complement]; exists {
			// Awesome, we found it! Let's return the indices of the pair.
			return []int{index, i}
		}
		// If not, let's remember this number and its index for future reference.
		numMap[num] = i
	}

	// If we get through all numbers without finding a pair, well, we'll just return nil.
	return nil
}

// Time Complexity: O(n) - We're taking a single stroll through our slice, no matter how big it is.
// Space Complexity: O(n) - In the worst case, we might have to remember each number and its position, which also grows linearly with the size of our slice.
