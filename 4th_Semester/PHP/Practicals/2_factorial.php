<!-- 2. Write a function to calculate the factorial of a number (non-negative integer). The function accept the number as an argument -->

<?php
$FILENAME = pathinfo(__FILE__, PATHINFO_FILENAME) . "." . pathinfo(__FILE__, PATHINFO_EXTENSION);
echo "<header><h1>FileName: " . $FILENAME . "</h1></header></br></br>";
?>

<head>
    <link rel="stylesheet" href="Extras/forPhp.css">
</head>

<body>
    <div class="form-container">
        <form action="" method="post">
            Enter a number: <input type="number" min="0" name="num"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['num'])) return;

$num = (int)$_POST['num'];

if ($num == null) return;

function findFactorial($n1)
{
    for ($i = $n1 - 1; $i > 1; $i--)
        $n1 *= $i;
    return $n1;
}

echo "<div class='result'>"
    . "The factorial of " . $num . " is: " . findFactorial($num)
    . "</div>";
?>