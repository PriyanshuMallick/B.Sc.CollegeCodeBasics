<!-- 10. Create a login page having user name and password.
On clicking submit, a welcome message should be displayed
if the user is already registered (i.e.name is present in the database)
otherwise error message should be displayed. -->

<?php
$FILENAME = pathinfo(__FILE__, PATHINFO_FILENAME) . "." . pathinfo(__FILE__, PATHINFO_EXTENSION);
echo "<header><h1>FileName: " . $FILENAME . "</h1></header></br></br>";
?>

<head>
    <link rel="stylesheet" href="forPhp.css">
</head>

<body>
    <div class="form-container">
        <!-- <form action="Extras/10_add_user.php" method="post"> -->
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

$username = $_POST['username'];
$password = $_POST['password'];

if (empty($username) || empty($password)) return;

$db = new mysqli('', 'root', '', 'test_users');

function signup($db, $username, $password)
{
    $query = "INSERT INTO users (username, password) VALUES ('$username', '$password')";
    $result = $db->query($query);

    echo  $result
        ? 'User added successfully'
        : 'Error while adding user: '; //. $db->error;
}
function login($db, $username, $password)
{
    $query = "SELECT * FROM users WHERE username = '$username' AND password = '$password'";
    $result =  $db->query($query);

    echo $result->num_rows > 0
        ? "Welcome '$username'"
        : 'Invalid username or password';
}



echo "<div class='result'>";
isset($_POST['LogIn']) ? login($db, $username, $password) : signup($db, $username, $password);
echo  "</div>";
?>