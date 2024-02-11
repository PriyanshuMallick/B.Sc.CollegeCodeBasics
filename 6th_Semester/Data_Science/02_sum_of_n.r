# 2.  Write a program that asks the user for a number n and prints the sum of the numbers 1 to n

n = as.integer(readline())

sum = 0
for (i in 1:n) {
    sum = sum + i
}

print(sum)