# 8.  Implement binary search.

binary_search <- function(arr, target, low = 0, high = length(arr)){
  # Base case: If high is less than low, target is not present
  if (low > high) return(-1)

  # Calculate the middle index
  mid <- low + (high - low)  %/% 2

  # Target found, return the index
  if (arr[mid] == target) {
    # Target found, return the index
    return (mid)
  }
  
  if (arr[mid] < target){
    # Target is in the upper half, adjust the low index and recurse
    return (binary_search(arr, target, mid + 1, high))
  }
  
  # Target is in the lower half, adjust the high index and recurse
  return (binary_search(arr, target, low, mid - 1))
  
}

nums <- c(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
target <- 7

print(binary_search(nums, target)) # > [1] 4