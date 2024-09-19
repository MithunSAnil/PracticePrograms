arr = list(map(int, input().split()))

cnt = 0
arr.sort()
arr = arr[::-1]
print(arr)
limit = int(input())

for i in range(limit-1,len(arr)-1):
    if arr[i+1] == arr[i]:
        cnt += 1
    else:
        break
print(limit + cnt)