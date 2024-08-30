if True:

# To create a dictionary with frequencies:
    for ele in nums:
        dict1[ele] = dict1.get(ele, 0) + 1 # dict1.get(key) is basically same as dict1[key] with exception handling

        # OR

    from collections import Counter
    dict1 = Counter(arr)

        # OR

    from collections import defaultdict
    dict1 = defaultdict(int) # Automatically handles missing keys
     

# To sort a dictionary by its values:
    l1 = sorted(dict1, key = dict1.get)[::-1] 

# To sort an array of string by length of the strings
    arr2 = sorted(arr1, key = len) #Sorted can be used for many such things

# To convert a string into an array of letters:
    arr = list(str1)

# Formatted string printing
    print(f"My name is {name} and my weight is {weight:.2f}") #:.2f for 2 decimal points

# Create lists easier
    arr = [x**2 for x in range(10)] # Creates an array with numbers from 0**2 to 9**2

# Math functions
    import math
    math.gcd(48, 12)
    math.factorial(5)

# Set operations
    a = {1, 2, 3}
    b = {2, 3, 4}
    union = a | b        # {1, 2, 3, 4}
    intersection = a & b # {2, 3}
    difference = a - b   # {1}

# Binary to decimal and vice versa
    binary = bin(10) # Gives binary value of 10 as a string with 0b prefix. 
    bi = binary[2:] # To obtain only the binary numbers in the string

    int("110", 2) # Converts the binary string into its corresponding decimal value