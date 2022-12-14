// OS7. Write a program to copy files using system calls.

#include <iostream>
using namespace std;
#include <unistd.h>
#include <fcntl.h>

int main(int argc, char *argv[])
{
    if (argc < 2)
    {
        system("echo \"Enter source and destination\"");
        return 1;
    }

    char buf;
    int f1, f2;

    f1 = open(argv[1], O_RDONLY);

    if (f1 == -1)
    {
        system("echo \"Error opening firstfile\"");
        close(f1);
        return 1;
    }

    f2 = open(argv[2], O_WRONLY | O_CREAT, 0641);

    while (read(f1, &buf, 1))
    {
        write(f2, &buf, 1);
    }

    close(f1);
    close(f2);
}