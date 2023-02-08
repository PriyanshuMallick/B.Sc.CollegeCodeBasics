<!-- 4. Create a PHP page which accepts string from user. After submission that page displays the reverse of provided string -->

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
            Enter a text: <input type="text" name="str"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['str'])) return;

$str = (string)$_POST['str'];

if ($str == null) return;

echo "<div class='result'>"
    . "Reverse of '" . $str . "' is:<br>" . strrev($str)
    . "</div>";
?>