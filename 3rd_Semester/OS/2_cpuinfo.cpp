// 2. Write a program to report behavior of Linux kernel including kernel version, CPU type
// and model. (CPU information)

#include <iostream>
#include <stdlib.h>
#include <stdio.h>

using namespace std;

int main()
{
    cout << "\nThe kernal version if: ";
    system("cat /proc/sys/kernel/osrelease");
    cout << "\nCPU Info: ";
    system("cat /proc/cpuinfo | awk '/processor|model/{print}'");
    return 0;
}