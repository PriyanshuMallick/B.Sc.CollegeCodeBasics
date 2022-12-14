# 13. Write a shell script to find the power of a given number.

ans=1
i=0
while [ $i -lt $2 ]
do
    ans=$(($1 * $ans))
    i=$((i + 1))
done
echo "$1 ^ $2 = $ans"
