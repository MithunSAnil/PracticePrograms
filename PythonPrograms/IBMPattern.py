n = int(input())

arr = [[0]*(n*2 - 1) for _ in range(n*2 - 1)]

l = n*2 - 1
k = 0
while(l>=1):
    for i in range(k, l):
        for j in range(k, l):
            if i == l-1 or j == l - 1 or i == k or j == k:
                arr[i][j] = n
    l -= 1
    k += 1
    n -= 1
for ele in arr:
    print(*ele)

# 4
# 4 4 4 4 4 4 4
# 4 3 3 3 3 3 4
# 4 3 2 2 2 3 4
# 4 3 2 1 2 3 4
# 4 3 2 2 2 3 4
# 4 3 3 3 3 3 4
# 4 4 4 4 4 4 4