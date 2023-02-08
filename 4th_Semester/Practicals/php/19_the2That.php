<!-- 19. Write a PHP script to replace the first 'the' of the following string with 'That'.
    Sample : 'the quick brown fox jumps over the lazy dog.'
    Expected Result : That quick brown fox jumps over the lazy dog. -->

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
            Enter Text: <input type="text" min="1" name="string"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['string'])) return;

$string = $_POST['string'];

if ($string == null) return;

echo "<div class='result'>";
echo $string . "<br><br>";
echo preg_replace('/the/i', 'That', $string, 1);
echo  "</div>";
?>