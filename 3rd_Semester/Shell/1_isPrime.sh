# 1. Write a shell script to check if the number entered at the command line is prime or not.

num=$1
i=2
flag=0

if [ $num -lt 2 ]
    then flag=1

elif [ $num -eq 2 ] | [ $num -eq 3 ]
    then flag=0
    
else
    while [ $i -le $((num / 2)) ]
    do
        if [ $((num % i)) -eq 0 ]
        then
            flag=1
        fi
        i=$((i + 1))
    done
fi

if [ $flag == 1 ]
    then echo "$num is not a prime number"
else
    echo "$num is a prime number"
fi