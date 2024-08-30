# 0 1 1 2 3 5 8 13 21

def fibonacci(n):
    if n == 0:
        result = 0
    elif n == 1 or n == 2:
        result = 1
    else:
        result = fibonacci(n-1) + fibonacci(n-2)
    return result

n = int(input())

print(fibonacci(n))