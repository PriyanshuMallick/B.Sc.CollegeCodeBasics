<!-- 14. Write a simple PHP program to check that emails are valid. -->

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
            Enter your E-mail<input type="text" minlength="5" name="email"><br><br>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['email'])) return;

$email = $_POST['email'];

if ($email == null) return;

// Regex = User Name + @ + Domain Name + . + Extension 
// Eg = name@gmail.com

$regex = "/^" . "[a-zA-Z0-9._%+-]+" . "@" . "[a-zA-Z0-9.-]+" . "\." . "[a-zA-Z]{2,}$/";

echo "<div class='result'>";
echo "Your email: " . $email . "<br><br>Is ";
echo preg_match($regex, $email) ? "a valid" : "an invalid";
echo " E-mail address";
echo  "</div>";
?>