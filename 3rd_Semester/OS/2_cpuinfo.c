// 2. Write a program to report behavior of Linux kernel including kernel version, CPU type
// and model. (CPU information)

#include <stdlib.h>

int main()
{
    system("echo \"The kernal version is: \"");
    system("cat /proc/sys/kernel/osrelease");
    system("echo \"\nCPU Info: \"");
    system("cat /proc/cpuinfo | awk '/processor|model/{print}'");
    return 0;
}