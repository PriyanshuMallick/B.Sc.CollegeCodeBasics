# 4. Write a shell script to accept a login name. If not a valid login name display message 
#  Entered login name is invalid.

read -p "Enter user username: " name
username = "asdf"
if [$name = $username]
then
    echo "Valid"
else
    echo "Invalid username"
fi