arr1 = eval(input())
arr2 = eval(input())

n = len(arr1)
m = len(arr2)

total = n + m
i = 0
j = 0

prev = 0
current = 0

for count in range(0, total//2 + 1):
    prev = current
    if (i < n) and (j >= m or arr1[i] <= arr2[j]):
        current = arr1[i]
        i += 1
    else:
        current = arr2[j]
        j += 1

if total % 2 == 0:
    print((current + prev)/2)
else:
    print(current)
