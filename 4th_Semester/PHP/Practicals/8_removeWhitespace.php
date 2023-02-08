<!-- 8. Write a PHP script that removes the whitespaces from a string. Sample string : 'The quick " " brown fox' Expected Output : Thequick""brownfox. -->

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
            Enter a text: <input type="text" name="str"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['str'])) return;

$str = preg_replace('/\s+/ ', '', $_POST['str']);

if ($str == null) return;


echo "<div class='result'>";
echo $str;
echo  "</div>";
?>