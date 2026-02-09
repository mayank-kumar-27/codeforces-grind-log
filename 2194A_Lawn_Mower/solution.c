#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int a, b;
    while (n--)
    {
        scanf("%d%d", &a, &b);
        int c = a / b;
        printf("%d\n", a - c);
    }

    return 0;
}