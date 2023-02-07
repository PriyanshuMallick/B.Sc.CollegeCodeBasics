<!-- 5. Write a PHP function that checks if a string is all lower case. -->

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
            Enter a text: <input type="text" name="str"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['str'])) return;

$str = (string)$_POST['str'];

echo "<div class='result'>"
    . "All the characters of ' " . $str . " ' are ";
echo ctype_lower(trim($str)) ? "" : "not";
echo " lowercase" . "</div>";
?>