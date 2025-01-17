# Python Calculator

number01 = float(input("Enter the 1nd number: "))

number02 = float(input("Enter the 2nd number: "))

operator = input("Enter an operator (+ - * /): ")

if operator == "+":
    result = number01 + number02
    print(round(result, 3))
elif operator == "-":
    result = number01 - number02
    print(round(result, 3))
elif operator == "*":
    result = number01 * number02
    print(round(result, 3))
elif operator == "/":
    result = number01 / number02
    print(round(result, 3))
else:
    print(f"`{operator} is an invalid operator")
