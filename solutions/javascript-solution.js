/**
 * 
 * @param {number[]} nums 
 * @param {number} target 
 * @return {number[]}
 */
function twoSum(nums, target) {
    // first things first, we need a way to remember where we've seen each number.
    // we'll use an object for this. let's call it nummap.
    const nummap = {};

    // next, let's figure out how many numbers we have in our array.
    const n = nums.length;

    // now, let's go through each number one by one and see if we can find its pair.
    for (let i = 0; i < n; i++) {
        // first, let's figure out what number we need to add to the current number to reach our target.
        const complement = target - nums[i];
        // if we've already seen this needed number before, it means we've found our pair!
        if (complement in nummap) {
            // awesome, we found it! let's return the indices of the pair.
            return [nummap[complement], i];
        }
        // if not, let's remember this number and its index for future reference.
        nummap[nums[i]] = i;
    }

    // if we get through all numbers without finding a pair, well, we'll just return an empty array.
    return [];
}

// Time Complexity: O(n) - We're taking a single stroll through our array, no matter how big it is.
// Space Complexity: O(n) - In the worst case, we might have to remember each number and its position, which also grows linearly with the size of our array.
