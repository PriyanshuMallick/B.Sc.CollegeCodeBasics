// 1. Write a program (using fork() and/or exec() commands) where parent and child
// execute:
// a) same program, same code.
// b) same program, different code.
// c) before terminating, the parent waits for the child to finish its task.

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