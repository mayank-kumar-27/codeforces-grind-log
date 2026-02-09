#include <bits/stdc++.h>
using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;
    while (t--)
    {
        int n;
        long long x, y;
        cin >> n >> x >> y;
        vector<long long> a(n);
        long long total = 0;
        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
            total += (a[i] / x) * y;
        }
        long long answer = 0;
        for (int i = 0; i < n; i++)
        {
            long long conti = (a[i] / x) * y;
            long long result = a[i] + (total - conti);
            answer = max(answer, result);
        }
        cout << answer << "\n";
    }
    return 0;
}