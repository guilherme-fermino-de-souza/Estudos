print(help(str))
name = input("Enter your full name: ")

# result = len(name) #num of characteres
# result = name.find(" ") #first occurence(starts in zero)
# result = name.rfind(" ") #Reverse find method
# returns -1 if dont find nothing
# result = name.capitalize() #Abc
# result = name.upper() #ABC
# result = name.lower() #abc
# result = name.isdigit() #returns True if there are only numbers in the String
# result = name.isalpha() #return True if there is only Alpha in the String
# result = name.count("e")
result = name.replace("e", "a")


print(result)
