#include <stdio.h>
int main() {
    int m, n;
    scanf("%d%d", &m, &n);
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (i % 2 == 0) {
                printf("#");
            }
            else
            {
                if ((i / 2) % 2 == 0) {
                    if (j == n - 1) printf("#");
                    else printf(".");
                } else {
                    if (j == 0) printf("#");
                    else printf(".");
                }
            }
        }
        printf("\n");
    }
    return 0;
}