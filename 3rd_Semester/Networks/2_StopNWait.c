// 2. Simulate and implement stop and wait protocol for noisy channel.

#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

int main()
{
    int msg;
    int nframes = 10;
    int frameNo = 1;
    int j = 1;
    system("clear");
    printf("\nTotal no of frame to be sent %d\n", nframes);
    while (nframes > 0)
    {
        printf("\n\n->Sending frame- %d", frameNo);
        msg = rand() % 10;
        printf("\n Value of frame= %d", msg);
        if (msg % 5 == 0)
        {
            sleep(2);
            printf("\n No acknowledgement received frame- %d", frameNo);
            printf("\n\n->Resending frame - %d", frameNo);
            msg = rand() % 10;
            printf("\n Value of frame= %d", msg);
        }
        printf("\n Acknowledgement for frame %d", frameNo);
        nframes--;
        frameNo++;
    }
    return 0;
}