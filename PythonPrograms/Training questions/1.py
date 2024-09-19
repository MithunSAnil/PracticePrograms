# Reena is a research scholar she is researching and taking records of the sunrise every day and she is going to be involved in another project so she has to give someone a date and tell them how many days they recorded the sunrise. Develop an algorithm or function that takes a date as input and calculates the number of days remaining in the current year. The solution should consider leap years, where an additional day (February 29th) is added, and handle both past and future dates accurately. The algorithm should be efficient, provide real-time results, and ensure accurate calculations based on the Gregorian calendar.

# Input: The input to the algorithm or function is a specific date in the format of day, month, and year. 12/12/2000-19

# Output: The output should be the number of days remaining in the current year from the given date.
def isLeap(year):
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        return True
    else:
        return False
daysum = 0
str1 = input()
day, month, year = str1.split("/")

for i in range(1, int(month)):
    if i == 2:
        if isLeap(int(year)):
            daysum += 29
        else:
            daysum += 28
    elif i in [4, 6, 9, 11]: 
        daysum += 30
    else: 
        daysum += 31
    
daysum += int(day) 

if isLeap(int(year)):
    print(366 - daysum)
else:
    print(365 - daysum)

