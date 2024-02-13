# 4.  Write a function that returns the largest element in a list.

find_largest <- function(lst) {
  if (length(list) < 1) {
     stop("The list is empty.")
  }

  largest  <- lst[[1]]
  
  for (i in 2:length(lst)) {
    if (lst[[i]] > largest) {
      largest <- lst[[i]]
    }
  }
  
  return(largest)
}

arr <- c(1, 5, 42, 85, 1025, 654, 5)

cat("The largest element is", find_largest(arr), "\n")

