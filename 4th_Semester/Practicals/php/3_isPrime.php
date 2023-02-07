<!-- Write a function to calculate the factorial of a number (non-negative integer). The function accept the number as an argument -->

<?php
$FILENAME = pathinfo(__FILE__, PATHINFO_FILENAME) . ".php";
echo "<h1>FileName: " . $FILENAME . "</h1></br></br>";
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>
        <?= $FILENAME ?>
    </title>
    <link rel="stylesheet" href="forPhp.css">
</head>

<body>
    <div class="form-container">
        <form action="" method="post">
            Enter a number: <input type="number" name="num"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['num'])) return;

function isPrime($num)
{
    if ($num < 2) return false;
    if ($num == 2 || $num == 3) return true;
    if ($num % 2 == 0) return false;
    for ($i = 3, $lim = ceil(sqrt($num)); $i <= $lim; $i += 2)
        if ($num % $i == 0)
            return false;
    return true;
}

$num = (int)$_POST['num'];

echo "<div class='result'>"
    . $num . " is: ";
echo isPrime($num) ? "" : "Not" . "Prime" . "<br>"
    . "</div>";
?>