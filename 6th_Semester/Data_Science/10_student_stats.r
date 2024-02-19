# 10. Fifteen students were enrolled in a course. There ages were:
#     20 20 20 20 20 21 21 21 22 22 22 22 23 23 23
#     i. Find the median age of all students under 22 years
#     ii. Find the median age of all students
#     iii. Find the mean age of all students
#     iv. Find the modal age for all students
#     v. Two more students enter the class. The age of both students is 23. What is now mean, mode and median?

# Initial ages of students
# 20 20 20 20 20 21 21 21 22 22 22 22 23 23 23
ages <- c(20, 20, 20, 20, 20, 21, 21, 21, 22, 22, 22, 22, 23, 23, 23)
# Sorting the vector in ascending order
ages_sorted <- sort(ages)

cat("Sorted ages", ages)

# i. Find the median age of all students under 22 years
cat("\n\ni. Find the median age of all students under 22 years\n")
under_22 <- ages_sorted[ages_sorted < 22]
median_under_22 <- median(under_22)
cat("The median age of all students under 22 years is", median_under_22, "\n")

# ii. Find the median age of all students
cat("\n\nii. Find the median age of all students\n")
median_all <- median(ages_sorted)
cat("The median age of all students is", median_all, "\n")

# iii. Find the mean age of all students
cat("\n\niii. Find the mean age of all students\n")
mean_all <- mean(ages_sorted)
cat("The mean age of all students is", mean_all, "\n")

# iv. Find the modal age for all students
cat("\n\niv. Find the modal age for all students\n")
modal_age <- mode(ages_sorted)
cat("The modal (most common) age among all students is", modal_age, "\n")

# v. Two more students enter the class. The age of both students is 23. What is now mean, mode and median?
cat("\n\nv. Two more students enter the class. The age of both students is 23. What is now mean, mode and median?\n")
new_ages  <- sort(c(ages_sorted, 23, 23))
cat("New ages", ages, "\n")

# New mean
new_means <- mean(new_ages)
cat("The new mean is", new_means, "\n")

# New mode
new_modes <- mode(new_ages)
cat("The new modal (most common) age is", new_modes, "\n")

# New median
new_median <- median(new_ages)
cat("The new median is", new_median, "\n")
