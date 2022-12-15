// 3. Simulate and implement go back n sliding window protocol.

#include <iostream>
#include <ctime>
using namespace std;
int main()
{
    int nFrames, winSize, c = 0, frameToSent = 1;
    srand(time(NULL));
    cout << "Enter the number of frames : ";
    cin >> nFrames;
    cout << "Enter the Window Size : ";
    cin >> winSize;

    while (frameToSent <= nFrames)
    {
        int ackRev = 0;
        for (int frame = frameToSent; frame < frameToSent + winSize && frame <= nFrames; frame++)
        {
            cout << "Sent Frame " << frame << endl;
            c++;
        }
        for (int frame = frameToSent; frame < frameToSent + winSize && frame <= nFrames; frame++)
        {
            int flag = rand() % 2;
            if (!flag)
            {
                cout << "Acknowledgment for Frame " << frame << endl;
                ackRev++;
            }
            else
            {
                cout << "Frame " << frame << " Not Received" << endl;
                cout << "Retransmitting Window" << endl;
                break;
            }
        }
        cout << endl;
        frameToSent += ackRev;
    }
    cout << "Total number of transmissions : " << c << endl;
    return 0;
}