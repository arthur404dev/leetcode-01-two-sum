def two_sum(nums, target)
    # First things first, we need a way to remember where we've seen each number.
    # We'll use a hash for this. Let's call it num_map.
    num_map = {}
    
    # Next, let's figure out how many numbers we have in our array.
    n = nums.length

    # Now, let's go through each number one by one and see if we can find its pair.
    nums.each_with_index do |num, i|
        # First, let's figure out what number we need to add to the current number to reach our target.
        complement = target - num
        # If we've already seen this needed number before, it means we've found our pair!
        if num_map.include?(complement)
            # Awesome, we found it! Let's return the indices of the complement and the current number.
            return [num_map[complement], i]
        end
        # If not, let's remember this number and its index for future reference.
        num_map[num] = i
    end

    # If we get through all numbers without finding a pair, well, we'll just return an empty array.
    return []
end

# Time Complexity: O(n) - We loop through the array once.
# Space Complexity: O(n) - In the worst case, we might have to remember each number and its position, which also grows linearly with the size of our array.
