# Prints aaaaabbbcc for sample input a5b3c2

from collections import defaultdict

dict1 = defaultdict(str)

str1 = input()

for ele in str1:
    if ele.isalpha():
        now = ele
    else:
        dict1[now] += ele

for ele in dict1:
    print(ele*int(dict1[ele]), end = "")
