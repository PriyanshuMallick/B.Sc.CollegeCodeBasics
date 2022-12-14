# 11. Write a shell script to find the LCD(least common divisor) of two numbers

if [ $1 -gt $2 ]
then
    num=$1
    den=$2
else
    num=$2
    den=$1
fi
rem=$((num % den))

while [ $rem -ne 0 ]
do
    num=$den
    den=$rem
    rem=$((num % den))
done

gcd=$den
lcd=$(($1 * $2 / $gcd))
# lcd=`expr $a \* $b / $gcd`

echo " The LCD of $a and $b is : $lcd"