//  OS6. Write a program to print file details including owner access
// permissions, file access time, where file name is given as argument.

#include <iostream>
#include <stdlib.h>
#include <unistd.h>
#include <sys/stat.h>
#include <sys/types.h>

using namespace std;

int main(int argc, char *argv[])
{
    int i;
    struct stat s;

    if (argc < 2)
    {
        cout << "\nEnter filename\n";
        exit(0);
    }

    for (int i = 1; i < argc; i++)
    {
        cout << "File : " << argv[i] << endl;
        if (stat(argv[i], &s) < 0)
            cout << "Error in obtaining stats\n";
        else
        {
            cout << "Owner UID : " << s.st_uid << endl;
            cout << "Group ID : " << s.st_gid << endl;
            cout << "Access Time : " << s.st_atime << endl;
            cout << "File Size : " << s.st_size << endl;

            cout << "File Permissions: \t";

            printf((S_ISDIR(s.st_mode)) ? "d" : "-");
            printf((s.st_mode & S_IRUSR) ? "r" : "-");
            printf((s.st_mode & S_IWUSR) ? "w" : "-");
            printf((s.st_mode & S_IXUSR) ? "x" : "-");
            printf((s.st_mode & S_IRGRP) ? "r" : "-");
            printf((s.st_mode & S_IWGRP) ? "w" : "-");
            printf((s.st_mode & S_IXGRP) ? "x" : "-");
            printf((s.st_mode & S_IROTH) ? "r" : "-");
            printf((s.st_mode & S_IWOTH) ? "w" : "-");
            printf((s.st_mode & S_IXOTH) ? "x" : "-");
            cout << endl;
        }
    }
    return 0;
}