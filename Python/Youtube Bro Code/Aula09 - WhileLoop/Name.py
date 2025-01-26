# while loop = execute some code while some condition remains True
name = input("enter your name ")

while name == "":
    print("You did not enter yout name")
    name = input("enter your name ")
    
print(f"Hello {name}")
