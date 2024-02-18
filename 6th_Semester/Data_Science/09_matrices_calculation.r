# 9.  Implement matrices addition , subtraction and Multiplication

add_matrices <- function(matrix1,  matrix2) {
  if (any(dim(matrix1) != dim(matrix2))) {
    stop("Matrices must have the same dimensions for addition.")
  }
  return (matrix1 + matrix2)
}

subtract_matrices <- function(matrix1, matrix2) {
  if (any(dim(matrix1) != dim(matrix2))) {
    stop("Matrices must have the same dimensions for subtraction.")
  }
  return(matrix1 - matrix2)
}


multiply_matrices <- function(matrix1, matrix2) {
  if (ncol(matrix1) != nrow(matrix2)) {
    stop("The number of columns in the first matrix must equal the number of rows in the second matrix for multiplication.")
  }
  return(matrix1 %*% matrix2)
}

# Define two matrices
matrix1 <- matrix(c(1, 2, 3, 4), nrow=2, ncol=2)
matrix2 <- matrix(c(5, 6, 7, 8), nrow=2, ncol=2)

# Perform operations
added_matrices <- add_matrices(matrix1, matrix2)
subtracted_matrices <- subtract_matrices(matrix1, matrix2)
multiplied_matrices <- multiply_matrices(matrix1, matrix2)

# Display results
print("Added Matrices:")
print(added_matrices)
print("Subtracted Matrices:")
print(subtracted_matrices)
print("Multiplied Matrices:")
print(multiplied_matrices)

