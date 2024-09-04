#IBM test question

arr = input().split()
ans = []
for i in range(0, 4):
    if arr[0: i+1].count(arr[i]) > 2:
        ans.append("{status 429, message: Too many requests}")
        arr[i] = None
    else:
        ans.append("{status 200, message: OK}")

for i in range(4,len(arr)):
    if arr[i-4: i+1].count(arr[i]) > 2:
        ans.append("{status 429, message: Too many requests}")
        arr[i] = None
    else:
        ans.append("{status 200, message: OK}")
    
print(*ans)

# xyz abc xyz pqr abc xyz xyz abc xyz