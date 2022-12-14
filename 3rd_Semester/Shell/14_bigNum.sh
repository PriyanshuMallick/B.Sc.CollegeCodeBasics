# 16. Write a shell script to find the greatest number among the three numbers.

if [ $1 -gt $2 ] && [ $1 -gt $3 ]
then 
    echo "Greatest number is $1"
elif [ $2 -gt $1 ] && [ $2 -gt $3 ]
then 
    echo "Greatest number is $2"
else
    echo "Greatest number is $3"
fi