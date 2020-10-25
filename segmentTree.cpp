#include <bits/stdc++.h>

using namespace std;

typedef long long int ll;

struct segTree
{
    int size;
    vector<long long int> sums;

    void init(int n)
    {
        size = 1;
        while (size < n)
        {
            size <<= 1;
        }

        sums.resize(2 * size);
    }

    void set(int i, int v, int x, int lx, int rx)
    {
        if (rx - lx == 1)
        {
            sums[x] = v;
            return;
        }

        int m = (lx + rx) / 2;

        if (i < m)
        {
            set(i, v, 2 * x + 1, lx, m);
        }
        else
        {
            set(i, v, 2 * x + 2, m, rx);
        }

        sums[x] = sums[2 * x + 1] + sums[2 * x + 2];
    }

    void set(int i, int v)
    {
        set(i, v, 0, 0, size);
    }

    long long int sum(int l, int r, int x, int lx, int rx)
    {
        if (lx >= r || l >= rx)
        {
            return 0;
        }

        if (lx >= l && rx <= r)
            return sums[x];

        int mid = (lx + rx) / 2;

        long long int s1, s2;
        s1 = sum(l, r, 2 * x + 1, lx, mid);
        s2 = sum(l, r, 2 * x + 2, mid, rx);

        return s1 + s2;
    }

    long long int sum(int l, int r)
    {
        return sum(l, r, 0, 0, size);
    }

    void build(vector<int> &a, int x, int lx, int rx)
    {
        if ((rx - lx) == 1)
        {
            if (lx < (int)(a.size()))
            {
                sums[x] = a[lx];
            }
            return;
        }

        int m = (lx + rx) / 2;

        build(a, 2 * x + 1, lx, m);
        build(a, 2 * x + 2, m, rx);
        sums[x] = sums[2 * x + 1] + sums[2 * x + 2];
    }

    void build(vector<int> &a)
    {
        build(a, 0, 0, size);
    }
};

int main()
{
    segTree s;
    int n;
    cout<<"Enter the size of array\n";
    cin>>n;
    s.init(n);
    cout<<"Enter the values\n";
    vector<int> v(n);
    for(auto &x: v) cin>>x;

    s.build(v);
    int l,r;
    char c;
    bool again = true;
    while (again)
    {
        cout << "enter starting index and number of values to calculate sum\n";

        cin>>l>>r;
        r+=l;
        cout<<s.sum(l,r)<<'\n';

        cout<<"To calculate sum again press y and press n to exit\n";
        cin>>c;
        again = (c == 'y')? true : false;
    }
    
    return 0;
}