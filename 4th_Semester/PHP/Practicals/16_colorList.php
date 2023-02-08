<!-- 16. $color = array('white', 'green', 'red')
    Write a PHP script which will display the colors in the following way :
    Output : white, green, red,
    • white
    • green
    • red -->

<?php
$FILENAME = pathinfo(__FILE__, PATHINFO_FILENAME) . "." . pathinfo(__FILE__, PATHINFO_EXTENSION);
echo "<header><h1>FileName: " . $FILENAME . "</h1></header></br></br>";
?>

<link rel="stylesheet" href="Extras/forPhp.css">

<?php
echo "<div class='form-container'>";
echo "<div class='result' style='text-align:left'>";
echo "<ul>";
$color = array('White', 'Green', 'Red');

for ($i = 0, $len = count($color); $i < $len; $i++) {
    echo "<li style=\"color:" . $color[$i] . "\">" . $color[$i] . "</li><br>";
}

echo  "</ul></div></div>";
?>