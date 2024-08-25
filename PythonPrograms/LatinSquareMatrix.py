n = int(input())
l1 = [chr(65 + i) for i in range(n)]
print(*l1)
l2 = [0 for i in range(n)]
for i in range(1,n):
    for j in range(n):
        l2[j] = l1[(j+i)%n]

    print(*l2)