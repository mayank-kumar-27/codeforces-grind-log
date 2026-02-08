#include <stdio.h>
int main() {
    int n, c = 0;
    scanf("%d", &n);
    while (n--) {
        int a, b;
        scanf("%d%d", &a, &b);
        c += (b - a >= 2) ? 1 : 0;
    }
    printf("%d", c);
    return 0;
}