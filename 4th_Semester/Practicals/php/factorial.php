<!-- Write a function to calculate the factorial of a number (non-negative integer). The function accept the number as an argument -->

<?php
echo "FileName: " . pathinfo(__FILE__, PATHINFO_FILENAME) . ".php\n";

function findLargest($n1, $n2, $n3)
{
    if ($n1 >= $n2 && $n1 >= $n3)
        return $n1;
    elseif ($n2 >= $n1 && $n2 >= $n3)
        return $n2;
    else
        return $n3;
}

$num1 = 10;
$num2 = 20;
$num3 = 30;

$largest = findLargest($num1, $num2, $num3);

echo "The largest number is: " . $largest;
?>

<html>

<body>

    <form action="" method="post">
        Enter first number: <input type="text" name="num1"><br>
        Enter second number: <input type="text" name="num2"><br>
        Enter third number: <input type="text" name="num3"><br>
        <input type="submit" value="Submit">
    </form>

</body>

</html>