// 2. Simulate and implement stop and wait protocol for noisy channel.

#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>

int main()
{
    int i, j, nf, x;
    nf = 10;
    i = 1;
    j = 1;
    system("clear");
    printf("\nTotal no of frame to be sent %d\n", nf);
    while (nf > 0)
    {
        printf("\n\n->Sending frame- %d", i);
        x = rand() % 10;
        printf("\n Value of x = %d", x);
        if (x % 5 == 0)
        {
            sleep(2);
            printf("\n No acknowledgement received frame- %d", i);
            printf("\n\n->Resending frame - %d", i);
            x = rand() % 10;
        }
        printf("\n Acknowledgement for frame %d", j);
        nf--;
        i++;
        j++;
    }
    return 0;
}