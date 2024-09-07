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

# For initialising a matrix
    mat1 = [[None]*n for _ in range(n)]

# Permutation and combination

    import itertools
    l1 = [1, 2, 3]
    l2 = list(itertools.permutations(l1))
    l2 = list(itertools.combinations(l1, c))

# Sort dictionary by items
    s = dict(sorted(my_dict.items()))

# Heap opeations
    # Python only has minheap by default. So push negative of the numbers to get the maxheap
    import heapq
    minHeap = []
    heapq.heappush(minHeap, value) # To push element to minheap
    heapq.heappop(minHeap) # To pop minimum element from the minheap
    heapq.heapify(list1) # Converts list to minheap