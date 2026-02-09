#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    int a, b;
    while (n--) {
        scanf("%d%d", &a, &b);
        if (a % b == 0) printf("0\n");
        else {
            int c = a / b;
            printf("%d\n", (b * (c + 1)) - a);
        }
    }
    return 0;
}