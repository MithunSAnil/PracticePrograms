def fibonacci(n, memo = {}):
    if n in memo:
        return memo[n]
    elif n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        result = fibonacci(n-1) + fibonacci(n-2)
        memo[n] = result
        return result


n = int(input())
print(fibonacci(n))