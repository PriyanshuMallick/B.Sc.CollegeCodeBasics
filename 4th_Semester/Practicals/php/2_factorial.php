<!-- Write a function to calculate the factorial of a number (non-negative integer). The function accept the number as an argument -->

<?php
echo "<h1>FileName: " . pathinfo(__FILE__, PATHINFO_FILENAME) . ".php</h1></br></br>";
?>

<head>
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

function findFactorial($n1)
{
    for ($i = $n1 - 1; $i > 1; $i--)
        $n1 *= $i;
    return $n1;
}

$num = (int)$_POST['num'];

if ($num < 0) {
    echo "<div class='result'>" . "Invalid number: $num" . "</div>";
    return;
} else {
    echo "<div class='result'>"
        . "The factorial of " . $num . " is: " . findFactorial($num)
        . "</div>";
} ?>