# 9. Write a shell script to find the sum of digits of a given number

num=$1
sum=0
while[num -gt 0]
do
    mod=$((num % 10))
    sum=$((mod + sum))
    num=$((num /  10))
done

echo $sum
