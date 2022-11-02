read -p "Enter a number: " num
fac=$num
while [ $num -gt 2 ]
do  
    num=$(($num - 1))
    fac=$(($fac * $num))
done
echo $fac