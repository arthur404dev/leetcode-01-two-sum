use std::collections::HashMap;

fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
    // Create a HashMap to store numbers and their indices
    let mut num_map: HashMap<i32, i32> = HashMap::new();
    // Iterate over each number in the array
    for (i, &num) in nums.iter().enumerate() {
        // Calculate the complement of the current number
        let complement = target - num;
        // If the complement exists in the HashMap
        if let Some(&index) = num_map.get(&complement) {
            // Return the indices of the complement and the current number
            return vec![index, i as i32];
        }
        // Otherwise, store the current number and its index in the HashMap
        num_map.insert(num, i as i32);
    }
    // If no solution is found, return an empty vector
    vec![]
}

// Time Complexity: O(n) - We iterate through the array once.
// Space Complexity: O(n) - We store at most 'n' elements in the HashMap.
