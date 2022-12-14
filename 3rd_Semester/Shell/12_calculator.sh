# 12. Write a shell script to perform the tasks of basic calculator.

echo "Enter Choice :"
echo "1. Addition"
echo "2. Subtraction"
echo "3. Multiplication"
echo "4. Division"
read op
ans="Invalid Choice"
case $op in
    1)ans=$(($1 + $2))
    ;;
    2)ans=$(($1 - $2))
    ;;
    3)ans=$(($1 * $2))
    ;;
    4)ans=$(($1 / $2))
    ;;
esac
echo "Ans : $ans"