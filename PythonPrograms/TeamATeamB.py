p = int(input("p: "))
a = int(input("a: "))
b = int(input("b: "))
min1 = float("inf")
cnt = 0
a, b = max(a, b), min(a, b)
cnt += p // a
left = p - (p//a)*a
if left % b == 0:
    cnt += left // b
    if cnt < min1:
        min1 = cnt
        cnt = 0

if p % a == 0:
    min1 = p // a
    
if p % b == 0:
    cnt = p // b
    if cnt < min1:
        min1 = cnt
        cnt = 0

if min1 == float("inf"):
    print(-1)

else:
    print(min1)