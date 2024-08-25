n = int(input())
k = 1
rev = 1
for i in range(n):
    l1 = [j for j in range(k,k+n)]
    if rev == 1:
        print(*l1)
    else:
        l2 = l1[::-1]
        print(*l2)
    k += n
    rev = rev * -1

