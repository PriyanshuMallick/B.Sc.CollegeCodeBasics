# 7.  Implement linear search.

liner_search <- function(arr, target){
  # Loop through each element in the array
  for (i in 1:length(arr)) {
    # Check if the current element matches the target
    if (arr[i] == target) {
      # If a match is found, return the index of the match
      return (i)
    }
  }
	# If no match is found, return -1 or a similar indicator
  return (-1)
}

nums <- c(2,4,6,8,10)
target <- 6

print(liner_search(nums, target)) # > [1] 3