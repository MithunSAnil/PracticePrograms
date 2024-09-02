arr = eval(input())
target = int(input())

high = len(arr) - 1
low = 0

while(low <= high):
    mid = (low + high)//2
    if arr[mid] == target:
        print(f"{target} found at index {mid}")
        break
    elif arr[mid] > target:
        high = mid - 1
    else:
        low = mid + 1
else:
    print("Element not found")