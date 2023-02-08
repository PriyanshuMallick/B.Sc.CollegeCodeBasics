<!-- 18. Write a PHP program to print Fibonacci series using recursion. -->

<?php
$FILENAME = pathinfo(__FILE__, PATHINFO_FILENAME) . "." . pathinfo(__FILE__, PATHINFO_EXTENSION);
echo "<header><h1>FileName: " . $FILENAME . "</h1></header></br></br>";
?>

<head>
    <link rel="stylesheet" href="forPhp.css">
</head>

<body>
    <div class="form-container">
        <form action="" method="post">
            How many number of Fibonacci do you wanna see?
            </br></br>
            <input type="number" min="1" name="limit"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['limit'])) return;

$limit = $_POST['limit'];

if ($limit == null) return;

function fib($limit)
{
    if ($limit == 0) return 0;
    else if ($limit == 1) return 1;
    else return fib($limit - 1) + fib($limit - 2);
}

echo "<div class='result'>";
for ($i = 0; $i < $limit; $i++) {
    echo fib($i) . " ";
}
echo  "</div>";
?>