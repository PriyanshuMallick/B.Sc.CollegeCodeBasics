#include <iostream>
using namespace std;

main()
{
    int n, d, i, j, count, rem;

    cout << "Enter a no. \n";
    cin >> n;
    for (i = 0; i < 10; i++)
    {
        count = 0;
        d = n;
        for (; d != 0;)
        {
            rem = d % 10;
            d /= 10;
            if (rem == i)
            {
                count++;
            }
        }
        if (count != 0)
            cout << "Frequency of " << i << " is " << count << endl;
    }
}