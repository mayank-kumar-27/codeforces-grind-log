#include <stdio.h>
int main() {
    int a, b, h, r = 0;
    scanf("%d%d", &a, &b);
    while (a--) {
        scanf("%d", &h);
        r += (h <= b) ? 1 : 2;
    }
    printf("%d", r);
    return 0;
}