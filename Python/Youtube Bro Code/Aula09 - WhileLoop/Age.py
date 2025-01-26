# while loop = execute some code while some condition remains True

age = int(input("Enter your age: "))

while age < 0:
    print("Age cant´t be negative")
    age = int(input("Enter your age: "))

print(f"your age is {age}")
