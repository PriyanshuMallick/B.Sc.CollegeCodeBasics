<!-- Create a PHP page which accepts string from user. After submission that page displays the reverse of provided string -->

<?php
echo "<h1>FileName: " . pathinfo(__FILE__, PATHINFO_FILENAME) . ".php</h1></br></br>";
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
echo ctype_lower($str) ? "" : "not" . " lowercase"
    . "</div>";
?>