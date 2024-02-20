# 11. Following table gives a frequency distribution of systolic blood pressure. Compute all the measures of dispersion
#     |              |       |        |        |        |        |        |        |        |        |
#     | :----------: | :---: | :----: | :----: | :----: | :----: | :----: | :----: | :----: | :----: |
#     | **Midpoint** | 95\.5 | 105\.5 | 115\.5 | 125\.5 | 135\.5 | 145\.5 | 155\.5 | 165\.5 | 175\.5 |
#     |  **Number**  |   5   |   8    |   22   |   27   |   17   |   9    |   5    |   5    |   2    |

# Midpoints of the classes
midpoints <- c(95.5, 105.5, 115.5, 125.5, 135.5, 145.5, 155.5, 165.5, 175.5)

# Frequencies of each class
frequencies <- c(5, 8, 22, 27, 17, 9, 5, 5, 2)

# Calculate the mean
mean <- sum(midpoints * frequencies) / sum(frequencies)

# Calculate the approximate variance
variance <- sum(frequencies * (midpoints - mean)^2) / sum(frequencies)

# Calculate the standard deviation
std_dev <- sqrt(variance)

# For range, we use the maximum and minimum midpoints
range <- max(midpoints) - min(midpoints)

# Display the results
cat("Mean:", mean, "\n")
cat("Variance:", variance, "\n")
cat("Standard Deviation:", std_dev, "\n")
cat("Range:", range, "\n")

# For the interquartile range, we need to approximate quartiles, which is more complex with grouped data
# This is a basic approximation and might not be perfectly accurate
n <- sum(frequencies)
q1_position <- 0.25 * n
q3_position <- 0.75 * n

# Function to find the approximate quartile value
find_quartile <- function(position) {
  cumulative_frequencies <- cumsum(frequencies)
  class_index <- which(cumulative_frequencies >= position)[1]
  lower_bound <- ifelse(class_index == 1, min(midpoints) - (midpoints[2] - midpoints[1])/2, midpoints[class_index-1])
  class_frequency <- frequencies[class_index]
  class_width <- midpoints[2] - midpoints[1]
  cumulative_frequency_before_class <- ifelse(class_index == 1, 0, cumulative_frequencies[class_index - 1])
  
  quartile <- lower_bound + ((position - cumulative_frequency_before_class) / class_frequency) * class_width
  return(quartile)
}

q1 <- find_quartile(q1_position)
q3 <- find_quartile(q3_position)
iqr <- q3 - q1

cat("Q1:", q1, "\n")
cat("Q3:", q3, "\n")
cat("Interquartile Range (IQR):", iqr, "\n")