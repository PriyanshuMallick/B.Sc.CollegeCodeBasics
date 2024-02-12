# 3.  Write a program that prints a multiplication table for numbers up to 12.

n = as.integer(readline())

for (i in 1:12) {
    print(paste(n ," * ", i,  " = ", n*i))
}