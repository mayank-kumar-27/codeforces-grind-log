#include <stdio.h>
int main()
{
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            int x;
            scanf("%d", &x);
            if (x == 1) {
                printf("%d\n", abs(i - 2) + abs(j - 2));
                break;
            }
        }
    }
    return 0;
}