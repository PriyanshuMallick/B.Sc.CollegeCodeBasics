<!-- 11. Write a PHP script that checks if a string contains another string. -->

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
            Enter an string: <input type="text" name="string"><br><br>
            Enter another string: <input type="text" name="subString"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['string']) || !isset($_POST['subString'])) return;

$string = $_POST['string'];
$subString = $_POST['subString'];

if ($string == null || $subString == null) return;

echo "<div class='result'>";
echo "' " . $string . " '<br><br>";
echo str_contains($string, $subString) ? "contains" : "does not contain";
echo "<br><br>' " . $subString . " '";
echo  "</div>";
?>