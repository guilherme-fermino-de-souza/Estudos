# Format specifiers = {value:flags} format a value based on what
# flags are inserted

price01 = 15.12345
price10 = 10000000

print(f"Price 1 is ${price01:.7f}") # .(number)f  = round to that many decimal places (fixed point)
print(f"Price 2 is ${price01:.3}") # :(number) = allocate that many spaces
print(f"Price 3 is ${price01:09}") # :03 = allocate and zero pad that many spaces
print(f"Price 4 is ${price01:<}") # :< = left justify
print(f"Price 5 is ${price01:>}") # :> = right justify
print(f"Price 6 is ${price01:^}") # :^ = center align
print(f"Price 7 is ${price01:+}") # :+ = use a plus sign to indicate positive value
print(f"Price 8 is ${price01:=}") # := = place sign to leftmost position numbers
print(f"Price 9 is ${price01: }") # :  = insert a space before positive numbers
print(f"Price 10 is ${price10:,}") # :, = comma separator
