<!-- 1. Create a PHP page using functions for comparing three integers and print the largest number. -->

<?php
$FILENAME = pathinfo(__FILE__, PATHINFO_FILENAME) . "." . pathinfo(__FILE__, PATHINFO_EXTENSION);
echo "<header><h1>FileName: " . $FILENAME . "</h1></header></br></br>";
?>


<html>

<head>
	<title>
		<?= $FILENAME ?>
	</title>
	<link rel="stylesheet" href="forPhp.css">
</head>

<body>
	<div class="form-container">
		<form action="" method="post">
			Enter first number: <input type="number" name="num1"><br><br>
			Enter second number: <input type="number" name="num2"><br><br>
			Enter third number: <input type="number" name="num3"><br><br>
			<input type="submit" value="Submit">
		</form>
	</div>
</body>

</html>

<?php

if (!isset($_POST['num1']) || !isset($_POST['num2']) || !isset($_POST['num3'])) return;

$num1 = (int)$_POST['num1'];
$num2 = (int)$_POST['num2'];
$num3 = (int)$_POST['num3'];

if ($n1 == null | $n2 == null | $n3 == null) return;

function findLargest($n1, $n2, $n3)
{
	if ($n1 >= $n2 && $n1 >= $n3)
		return $n1;
	elseif ($n2 >= $n1 && $n2 >= $n3)
		return $n2;
	else
		return $n3;
}

$largest = findLargest($num1, $num2, $num3);

echo "<div class='result'>"
	. "The largest number is: " . $largest
	. "</div>";
?>