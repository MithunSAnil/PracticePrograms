n = int(input())
l1 = []
for i in range(n):
    person = input()
    l1.append(person)
amount = 200
for ele in l1:
    if "+" in ele:
        amount += 200
    else:
        amount += 100
if amount == 1300:
    amount = 1400
print(amount)