# collection = single variavle used to store multiple values
#    List = [] ordered and changeable. Duplicates OK
#    Set = {} unordered and immutable. but Add/Remove OK. NO Duplicates
#    Tuple = () ordered and unchangeable. Duplicates OK. FASTER

fruits = ["Apple", "orange", "banana", "coconut"]
# print(dir(fruits)) //Show all the diferent atributes and methods
# print(help(fruits)) //Documentation of the atributes and methods
# print(len(fruits))
# print("pineapple" in fruits) //True or False

print(fruits)
print(fruits[0])
print(fruits[::2])
print("Apple" in fruits)
# fruits[0] = "Changed"
# fruits.remove("Apple")
# fruits.insert(0, "pineapple")
# fruits.sort()
# fruits.reverse()
# fruits.clear()

# For Loop
for fruit in fruits:
    print(fruit)
