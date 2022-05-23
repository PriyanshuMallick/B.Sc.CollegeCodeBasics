// 11. Write a program that prints a table indicating the number of occurrences of each alphabet in the text entered as command line arguments

#include <iostream>
using namespace std;

int main(int argc, char *argv[])
{
    int i, c;
    for (i = 0, c = 0; argv[1][i] != '\0'; i++)
        if (argv[1][i] == argv[2][0])
            c++;
    cout << "Frequency of " << argv[2][0] << " in " << argv[1] << " is " << c;
    return 0;
}