export type projectFile = {
  name: string;
  description: string;
  link: string;
};

export const projectFiles: projectFile[] = [
  {
    name: "Larger Int",
    description:
      "Create a PHP page using functions for comparing three integers and print the largest number.",
    link: "largerInt.php",
  },
  {
    name: "Factorial",
    description:
      "Write a function to calculate the factorial of a number (non-negative integer). The function accept the number as an argument",
    link: "factorial.php",
  },
  {
    name: "Is Prime",
    description:
      "Write a program to check whether the given number is prime or not.",
    link: "isPrime.php",
  },
  {
    name: "Reverse String",
    description:
      "Create a PHP page which accepts string from user. After submission that page displays the reverse of provided string",
    link: "reverseString.php",
  },
];
