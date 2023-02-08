<!-- 7. Write a program to sort an values. -->

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
            Enter an array of space-separated values: <input type="text" name="values"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['values'])) return;

$values = $_POST['values'];

if ($values == null) return;

$values = explode(" ", $values);


echo "<div class='result'>";
echo "Unsorted values: " . implode(", ", $values) . "<br><br>";
sort($values);
echo "Sorted values: " . implode(", ", $values);
echo  "</div>";
?>