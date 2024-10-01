# Pythagorean triplet n**2 complexity
list1 = list(map(int, input().split()))

arr = list(map(lambda x : x**2, list1))
arr.sort()
n = len(arr)
for i in range(n-1, -1, -1):
    ele = arr[i]
    left = 0
    right = i - 1

    while(left < right):
        if arr[left] + arr[right] == ele:
            print(int(arr[left] ** 0.5), int(arr[right] ** 0.5),int(ele ** 0.5))
            left = left + 1
            right = right - 1
        elif arr[left] + arr[right] < ele:
            left = left + 1
        else:
            right = right - 1
