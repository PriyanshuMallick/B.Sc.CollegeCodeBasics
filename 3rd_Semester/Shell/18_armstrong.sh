# 18. Write a shell script to check whether the number is Armstrong or not.

num=$1
temp=$num
pow=0
sum=0
# To find the total number of digits in $num
while [ $temp -ne 0 ]
do
    temp=$((temp / 10 ))
    pow=$((pow + 1 ))
done

temp=$num

# Armstrong Algorithm
while [ $temp -gt 0 ]
do
    rem=$((temp % 10))
    x=1
    i=0
    # To find the pow of the number
    while [ $i -lt $pow ]
    do
        x=$(( x * rem))
        i=$((i + 1 ))
    done

    sum=$((sum + x))
    temp=$((temp/10))
done

if [ $sum -eq $num ]
then 
    echo "Armstrong"
else
    echo "Not Armstrong"
fi

echo $sum