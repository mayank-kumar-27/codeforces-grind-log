a, b = map(int, input().split())
s = list(input())

for _ in range(b):
    i = 0
    while i < a - 1:
        if s[i : i + 2] == ["B", "G"]:
            s[i], s[i + 1] = "G", "B"
            i += 2
        else:
            i += 1
print("".join(s))
