<!-- 10. Create a login page having user name and password.
On clicking submit, a welcome message should be displayed
if the user is already registered (i.e.name is present in the database)
otherwise error message should be displayed. -->

<!-------------------------------- WARNING -------------------------------->

<!--
    IF A DATABASE DOESN'T EXIST WITH THE NAME 
    AND A TABLE WITH THE NAME $tableName
    THEN RUN THE SCRIPT IN 'Extras/10_createDB.php' FIRST
-->

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
            <label for="username">Username:</label>
            <input type="text" name="username">
            <br>
            <label for="password">Password:</label>
            <input type="password" name="password">

            <input type="submit" value="Sign Up" name="SignUp">
            <input type="submit" value="Log in" name="LogIn">
    </div>
</body>

</html>

<?php
if (!isset($_POST['username']) || !isset($_POST['password'])) return;

$DBusername = $_POST['username'];
$password = $_POST['password'];

if (empty($DBusername) || empty($password)) return;

// The following parameters are set up as default MySQL host, user and password
// Change it if needed
$host = 'localhost';
$DBuser = 'root';
$password = '';

// Change the Data Base and Table Name if needed
$DBname = 'test_users';
$tableName = 'users';

$db = new mysqli($host, $DBuser, $password, $DBname);

function signup()
{
    global $tableName, $db, $DBusername, $password;
    $query = "INSERT INTO " . $tableName . " (username, password) VALUES ('$DBusername', '$password')";
    $result = $db->query($query);

    echo  $result
        ? 'User added successfully'
        : 'Error while adding user: ' . $db->error;
}
function login()
{

    global $tableName, $db, $DBusername, $password;
    $query = "SELECT * FROM " . $tableName . " WHERE username = '$DBusername' AND password = '$password'";
    $result =  $db->query($query);

    echo $result->num_rows > 0
        ? "Welcome '$DBusername'"
        : 'Invalid username or password';
}



echo "<div class='result'>";
isset($_POST['LogIn']) ? login() : signup();
echo  "</div>";
?>