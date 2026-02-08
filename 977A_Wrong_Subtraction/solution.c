#include <stdio.h>
int main() {
    int n, m;
    scanf("%d%d", &n, &m);
    for (int i = 0; i < m; i++) n % 10 == 0 ? n /= 10 : n--;
    printf("%d", n);
    return 0;
}