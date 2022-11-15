// 3. Write a program to report behavior of Linux kernel including information on
// configured memory, amount of free and used memory. (memory information)

#include <iostream>
#include <stdlib.h>

using namespace std;

int main()
{
    cout << "\nKernel Info: ";
    system("cat /proc/version_signature | awk '{printf \"Kernel Version: %s\\n\", $0}'");
    cout << "\n### Memory status: ";
    system("cat /proc/meminfo | awk '/Mem/ {print}'");
    return 0;
}