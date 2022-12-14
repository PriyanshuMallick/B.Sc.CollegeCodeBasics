// OS1. Write a program (using fork() and/or exec() commands) where
// parent and child execute same program, same code

#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main()
{
    pid_t pid;
    int p;
    p = fork();
    pid = getpid();

    if (p < 0)
    {
        fprintf(stderr, "Fork failed");
        return 1;
    }

    printf("Fork ID: %d\n", p);
    printf("Process ID: %d\n", pid);
    return 0;
}