<!-- 17. Using switch case and dropdown list display a Hello message depending on the language selected in drop down list. -->

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
            Select a language:
            <select name="language" id="language">
                <option value="en">English</option>
                <option value="hi">Hindi</option>
                <option value="ba">Bangla</option>
                <option value="as">Assamese</option>
                <option value="ne">Nepali</option>
                <option value="ja">Japanese</option>
                <option value="fr">French</option>
                <option value="de">German</option>
                <option value="es">Spanish</option>
            </select>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>

</html>

<?php
if (!isset($_POST['language'])) return;

$language = $_POST['language'];

if ($language == null) return;

echo "<div class='result'>";
switch ($language) {
    case 'en':
        echo 'Hello';
        break;
    case 'hi':
        echo 'नमस्ते';
        break;
    case 'ba':
        echo ' হ্যালো';
        break;
    case 'as':
        echo 'নমস্কাৰ';
        break;
    case 'ne':
        echo 'नमस्कार';
        break;
    case 'ja':
        echo 'こんにちは';
        break;
    case 'fr':
        echo 'Bonjour';
        break;
    case 'de':
        echo 'Hallo';
        break;
    case 'es':
        echo 'Hola';
        break;
}
echo  "</div>";
?>