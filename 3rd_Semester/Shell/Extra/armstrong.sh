read -p "Enter a Number: " num

temp=$num
pow=0
sum=0
# To find the total number of digits in $num
while [ $temp -gt 0 ]
do
    temp=$((temp / 10 ))
    pow=$((pow + 1 ))
done

temp=$num

# Armstrong Algorithm
while [ $temp -gt 0 ]
do
    rem=$((temp % 10))
    x=$rem
    i=$pow
    # To find the pow of the number
    while [ $i -gt 1 ]
    do
        x=$(( x * rem))
        i=$((i - 1 ))
    done

    sum=$((sum + x))
    temp=$((temp/10))
done

if [ $sum -eq $num ]
then 
    echo "Armstrong"
else
    echo "Not armstrong"
fi

echo $sum