<!-- 12. Create a simple 'birthday countdown' script, the script will count the number of days between current day and birth day. -->

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
            Enter Birth Date (DD/MM)<input type="text" minlength="3" maxlength="5" name="birthday"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['birthday'])) return;

$birthday = $_POST['birthday'];

if ($birthday == null) return;

list($day, $month) = explode('/', $birthday);

// Regex = Date (D/DD) + / + Month (M/MM)
$regex = "/^(0[1-9]|[12][0-9]|3[01]|[1-9])" . "\/" . "(0[1-9]|1[0-2])|[1-9]$/";

if (!preg_match($regex, $birthday)) {
    echo "<div class='result'>";
    echo "Invalid birthday," . "<br><br>" . "Please enter birthday correctly";
    echo  "</div>";
    return;
}

$currentYear = date('Y');
$birthday = new DateTime("$currentYear-$month-$day");

$current_date = new DateTime();

if ($current_date > $birthday) {
    $birthday->modify('+1 year');
}

$days_left = $current_date->diff($birthday)->format('%a');

echo "<div class='result'>";
echo "There are " . $days_left . " days until your birthday!";
echo  "</div>";
?>