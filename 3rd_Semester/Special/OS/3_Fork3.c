// OS3. Write a program (using fork() and/or exec() commands) where
// parent and child execute same program, same code and before
// terminating, the parent waits for the child to finish its task.

#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <sys/wait.h>

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
        wait(NULL);
        exit(1);
    }
    return 0;
}