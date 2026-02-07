#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    while (n--) {
        int a, b, c;
        scanf("%d", &a);
        scanf("%d", &b);
        scanf("%d", &c);
        if (a == b) printf("%d\n", c);
        else if (a == c) printf("%d\n", b);
        else printf("%d\n", a);
    }
    return 0;
}
