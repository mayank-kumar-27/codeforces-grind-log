#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int c = 0;
    c += n / 100;
    n %= 100;
    c += n / 20;
    n %= 20;
    c += n / 10;
    n %= 10;
    c += n / 5;
    n %= 5;
    c += n;
    printf("%d\n", c);
    return 0;
}