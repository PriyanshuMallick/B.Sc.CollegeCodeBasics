<?php
// This script is for setting up DB for 10_isRegistered.php
// The following parameters are set up as default MySQL host, user and password
// Change it if needed
$host = 'localhost';
$DBuser = 'root';
$password = '';

// Change the Data Base and Table Name if needed
$DBname = 'test_users';
$tableName = 'users';

// Connect to the database server
$db = new mysqli($host, $DBuser, $password);

// Check for an error
if ($db->connect_error) {
    die('<p>Connect Error (' . $db->connect_errno . ') ' . $db->connect_error . '</p>');
}

// Create the database
$query = "CREATE DATABASE IF NOT EXISTS " . $DBname;
$result = $db->query($query);

if ($result) {
    // Database was created successfully
    echo '<p>Database created successfully</p>';
} else {
    // An error occurred
    echo '<p>Error: ' . $db->error . '</p>';
}

// Entering/Using the newly created DB
$query = "USE " . $DBname;
$result = $db->query($query);

if ($result) {
    // Database was created successfully
    echo '<p>Entered/Using Database successfully</p>';
} else {
    // An error occurred
    echo '<p>Error: ' . $db->error . '</p>';
}

// Creating the required Table in the DB
$query = "CREATE TABLE IF NOT EXISTS " . $tableName . "(
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(30) NOT NULL,
    password VARCHAR(30) NOT NULL
  )";
$result = $db->query($query);

if ($result) {
    // Table was created successfully
    echo '<p>Table created successfully</p>';
} else {
    // An error occurred
    echo '<p>Error: ' . $db->error . '</p>';
}

// Close the connection
$db->close();
