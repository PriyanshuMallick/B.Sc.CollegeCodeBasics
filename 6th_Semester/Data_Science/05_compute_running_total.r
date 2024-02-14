# 5.  Write a function that computes the running total of a list.

find_running_total <- function(list) {
  # Create an empty vector to store the running totals
  running_totals <- numeric(length(x))

  # Initialize the first running total to the first element of the list
  running_totals[1] <- x[1]

  # Calculate the running totals for the remaining elements of the list
  for (i in 2:length(x)) {
    running_totals[i] <- running_totals[i - 1] + x[i]
  }

  # Return the running totals
  return(running_totals)
}

# Create a list of numbers
x <- c(1, 2, 3, 4, 5)

# Calculate the running totals of the list
running_totals <- find_running_total(x)

# Print the running totals
print(running_totals)