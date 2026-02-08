#include <stdio.h>
int main()
{
    int y;
    scanf("%d", &y);
    while (1) {
        y++;
        int a[4], i, j, f = 0;
        a[0] = y / 1000;
        a[1] = (y / 100) % 10;
        a[2] = (y / 10) % 10;
        a[3] = y % 10;
        for (i = 0; i < 4; i++) {
            for (j = i + 1; j < 4; j++) if (a[i] == a[j]) { f = 1; break; }
            if (f == 1) break;
        }
        if (f == 0) {
            printf("%d", y);
            break;
        }
    }
    return 0;
}