str1 = input()

i = 0 
j = len(str1) - 1

l1 = [""] * len(str1)

while j >= 0:
    l1[i] = str1[i]
    l1[j] = str1[j]

    i += 1
    j -=1
    print(*l1)
    l1 = [""] * len(str1)
    