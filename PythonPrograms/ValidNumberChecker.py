import re

str1 = input()

expression = r'^[+-]?(\d+(\.\d*)?|\.\d+)([eE][+-]?\d+)?$'

ans = re.match(expression,str1)

if bool(ans):
    print("true")
else:
    print("false")
