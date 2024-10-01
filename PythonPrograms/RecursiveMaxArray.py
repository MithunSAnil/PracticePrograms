def maxArr(arr, max1):
    if len(arr) == 0:
        return max1
    elif arr[0] > max1:
        max1 = arr[0]
        return maxArr(arr[1:], max1)
    else:
        return maxArr(arr[1:], max1)

arr = list(map(int, input().split()))
max1 = arr[0]

print(maxArr(arr[1:], arr[0]))