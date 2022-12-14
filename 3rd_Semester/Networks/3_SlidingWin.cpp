// 3. Simulate and implement go back n sliding window protocol.

#include <iostream>
#include <ctime>
using namespace std;
int main()
{
    int nf, N, c = 0, i = 1;
    srand(time(NULL));
    cout << "Enter the number of frames : ";
    cin >> nf;
    cout << "Enter the Window Size : ";
    cin >> N;

    while (i <= nf)
    {
        int x = 0;
        for (int j = i; j < i + N && j <= nf; j++)
        {
            cout << "Sent Frame " << j << endl;
            c++;
        }
        for (int j = i; j < i + N && j <= nf; j++)
        {
            int flag = rand() % 2;
            if (!flag)
            {
                cout << "Acknowledgment for Frame " << j << endl;
                x++;
            }
            else
            {
                cout << "Frame " << j << " Not Received" << endl;
                cout << "Retransmitting Window" << endl;
                break;
            }
        }
        cout << endl;
        i += x;
    }
    cout << "Total number of transmissions : " << c << endl;
    return 0;
}