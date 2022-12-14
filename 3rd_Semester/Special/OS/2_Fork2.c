// OS2. Write a program (using fork() and/or exec() commands) where
// parent and child execute same program, different code.

#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main()
{
    int pid = fork();

    if (pid < 0)
    {
        printf("\nError\n");
        exit(1);
    }
    else if (pid == 0)
    {
        printf("\nFrom Child Process\n");
        printf("Pid: %d\n", getpid());
        exit(0);
    }
    else
    {
        printf("\nFrom Parent Process\n");
        printf("Pid: %d\n", getpid());
        exit(1);
    }
    return 0;
}