# Variable = container for a value (string, intenger, float, boolean)

# String = serie of characters
first_name = "Guilherme"
food = "Carrot Cake"
email = "Guilhermefermino@gmail.com"

print(f"Hello {first_name}") #f means format
print(f"You like {food}")
print(f"Yout email is: {email}")

# Intengers
age = 17
quantity = 3
num_of_students = 40

print(f"You are {age} years old")
print(f"You are buying {quantity} items")
print(f"Your class has {num_of_students} students")

# Float - number with decimal
price = 10.99
gpa = 3.2
distance = 5.5

print(f"The price is R${price}")
print(f"Your gps is {gpa}")
print(f"You ran {distance}km")

# Boolean = True or False

is_student = True
for_sale = True
is_online = True

print(f"Are you a student?: {is_student}")

if is_student:
    print("You are a student")
else: 
    print("You are not a student")

if for_sale:
    print("That item is for sale")
else:
    print("that item is not available")

if is_online:
    print("You are online")
else:
    print("You are offline")
