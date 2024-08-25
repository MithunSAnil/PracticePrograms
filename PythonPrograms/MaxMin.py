n = int(input())
l1 = [int(input()) for i in range(n)]
l2 = []

while(len(l1)):
    if max(l1) != min(l1):
        l2.extend([max(l1), min(l1)])
    else:
        l2.append(max(l1))

    l1.remove(max(l1))
    if l1:
        l1.remove(min(l1))

print(l2)
