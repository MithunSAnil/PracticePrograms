# Method 1 using if else
n = int(input())
for i in range(n):
    for j in range(2*n - 1):
        if j < n-i-1:
            print(" ", end = "")
        elif j < n+i:
            print("*", end = "")
    print()

#Method 2 using two for loops
n = int(input())
for i in range(n):
    for j in range(n-i-1):
        print(" ", end = "")
    for j in range(2*i + 1):
        print("*", end = "")
    print()

#Method 3 using matrix
n = int(input())
mat = [[" "]*(n*2 - 1) for _ in range(n)]
row = 0
for i in range(n):
    for j in range(n-1, n+i):
        mat[i][j] = "*"
    for k in range(n-1, n-i-2, -1):
        mat[i][k] = "*"
for i in range(len(mat)):
    for j in range(len(mat)*2 - 1):
        print(mat[i][j], end = "")
    print()

