str1 = input()
n = len(str1)
mat1 = [[" "]*n for _ in range(n)]
i, j = 0 , n - 1

while (j >= 0):
    mat1[i][i] = str1[i]
    mat1[i][j] = str1[j]

    i += 1
    j -= 1

for k in range(n):
    for l in range(n):
        print(mat1[k][l],end="")
    print()