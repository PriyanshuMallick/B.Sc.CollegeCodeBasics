<!-- 13. Create a script to construct the following pattern, using nested for loop.
*
* *
* * *
* * * *
* * * * * -->

<?php
$FILENAME = pathinfo(__FILE__, PATHINFO_FILENAME) . "." . pathinfo(__FILE__, PATHINFO_EXTENSION);
echo "<h1>FileName: " . $FILENAME . "</h1></br></br>";
?>

<link rel="stylesheet" href="forPhp.css">

<?php
echo "<div class='form-container'>";
echo "<div class='result' style='text-align:left'>";
for ($i = 0; $i < 5; $i++) {
    for ($j = 0; $j < $i + 1; $j++) {
        echo "* ";
    }
    echo "<br>";
}
echo  "</div></div>";
?>