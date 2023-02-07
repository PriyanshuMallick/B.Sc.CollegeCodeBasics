<!-- 9. Write a PHP script that finds out the sum of first n odd numbers. -->

<?php
$FILENAME = pathinfo(__FILE__, PATHINFO_FILENAME) . "." . pathinfo(__FILE__, PATHINFO_EXTENSION);
echo "<h1>FileName: " . $FILENAME . "</h1></br></br>";
?>

<head>
    <link rel="stylesheet" href="forPhp.css">
</head>

<body>
    <div class="form-container">
        <form action="" method="post">
            Enter an array of space-separated numbers: <input type="number[]" name="values" value="0"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['values'])) return;

$values = explode(" ", $_POST['values']);

if ($values == null) return;

$sum = 0;
foreach ($values as $value) {
    if ($value % 2 != 0)
        $sum += $value;
}


echo "<div class='result'>";
echo "Input Values: " . implode(" ", $values) . "<br><br>";
echo "Sum of Odd Numbers: " . $sum;
echo  "</div>";
?>