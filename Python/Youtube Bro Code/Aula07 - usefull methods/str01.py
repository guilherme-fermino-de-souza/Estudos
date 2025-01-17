# Validate user input exercise
# 1. username is no more than 12 characters
# 2. username must not contain spaces
# 3. username must not contain digits

username = input("Enter a username: ")

username.find(" ")

if len(username) > 12:
    print("Your username cant be more than 12 characteres")
elif not username.find(" ") == -1:
    print("Your username cant not contain spaces")
elif not username.isalpha():
    print("Your username cant contain digits")
else:
    print(f"Welcome {username}")
