# 6.  Write a function that tests whether a string is a palindrome.

is_palindrome <- function(str){
  # Remove spaces and convert to lowercase
  str_clean = gsub("\\W", "", tolower(str))

  # Reverse the cleaned string
  rev_str  = paste(rev(unlist(strsplit(str_clean, ""))), collapse="")
  
  # Return TRUE if the cleaned string is equal to its reverse, FALSE otherwise
  return (str_clean == rev_str)
}

# Prompt the user to enter a word
str <- readline(prompt='Enter a word: ')

# Output whether the entered word is a palindrome
cat("The inputted word is", ifelse (is_palindrome(str), "", "not"), "a palindrome\n")