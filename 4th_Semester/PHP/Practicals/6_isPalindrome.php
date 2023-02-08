<!-- 6. Write a PHP script that checks whether a passed string is palindrome or not? ( A palindrome is word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run) -->

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

function isPalindrome($str)
{
    $str = strtolower(trim($str));
    for ($i = 0, $j = strlen($str) - 1; $i < $j; $i++, $j--) {
        if ($str[$i] != $str[$j]) {
            return false;
        }
    }
    return true;
}

echo "<div class='result'>" . $str . " is ";
echo isPalindrome($str) ? "" : "not";
echo " a Palindrome" . "</div>";
?>