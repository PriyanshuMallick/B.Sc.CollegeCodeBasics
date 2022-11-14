# 17. Write a shell script to find the factorial of a given number.

num=$1
fac=$num
while [ $num -gt 2 ]
do  
    num=$(($num - 1))
    fac=$(($fac * $num))
done
echo $fac