n = int(input("Enter the number of rows: "))
for i in range(n):
    for j in range(i+1):
        if i % 2 != 0:
            if j % 2 != 0:
                print(i+1, end = " ")
            else:
                print(chr(65 + i), end = " ")
        else:
            if j % 2 == 0:
                print(i+1, end = " ")
            else:
                print(chr(65 + i), end = " ")
    print()