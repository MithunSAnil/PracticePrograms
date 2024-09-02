# IBM test question
def minimalOperations(str1):
    ans = 0
    cnt = 0
    for i in range(len(str1) - 1):
        if str1[i] == str1[i+1]:
            cnt += 1
        else:
            ans += (cnt + 1)//2
            cnt = 0
    ans += (cnt + 1)//2
    return ans

result = []
arr = input().split()
for ele in arr:
    result.append(minimalOperations(ele))
print(result)
