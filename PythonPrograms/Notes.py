if False:

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
                            # OR
    arr = list(map(int, input.split())) # Takes string array and converts it every value into int and appends into arr
                            # OR
    arr = [int(x) for x in input().split()]
     

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

# For initialising a matrix
    mat1 = [[None]*n for _ in range(n)]

# Permutation and combination

    import itertools
    l1 = [1, 2, 3]
    l2 = list(itertools.permutations(l1))
    l2 = list(itertools.combinations(l1, c))

# Sort dictionary. 
    s = dict(sorted(my_dict.items())) # By items
    s = dict(sorted(my_dict.items(), key = lambda item : item[1])) # By values. item[1] returns values from the mydict.items() tuple
    s = dict(sorted(my_dict.items(), key = lambda item : len(item[1]))) # By length of the values

# Syntax of sorted
    dict(sorted(dictionaryname.items(), key = writeanyfunctionname)) # You can write functions like len or write functions using lambda and the
                                                                     # dictionary will be sorted according to this. can also be used for lists
# Heap opeations
    # Python only has minheap by default. So push negative of the numbers to get the maxheap
    import heapq
    minHeap = []
    heapq.heappush(minHeap, value) # To push element to minheap
    heapq.heappop(minHeap) # To pop minimum element from the minheap
    heapq.heapify(list1) # Converts list to minheap

# lambda is used to make small temporary functions
    square = lambda x : x**2 # returns x**2 for every x
    print(square(x))

# map is used apply something iteratively over a list
    a = list(map(lambda x : x // 2), lis1) # divides evey value of the list by 2. need to convert to list before printing

# filter is used to filter out values satisfying the function from a list
    a = list(filter(lambda x : x % 2 == 0), list1) # a contains values in list1 which returns True for the lambda function ie even numbers