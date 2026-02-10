#include <stdio.h>
#include <string.h>
int main() {
    int n, f = 0;
    scanf("%d", &n);
    char p[15];
    while (n--)
    {
        scanf("%s", &p);
        if (strcmp(p, "Tetrahedron") == 0) f += 4;
        else if (strcmp(p, "Cube") == 0) f += 6;
        else if (strcmp(p, "Octahedron") == 0) f += 8;
        else if (strcmp(p, "Dodecahedron") == 0) f += 12;
        else f += 20;
    }
    printf("%d",f);
    return 0;
}