number1 = int(input("Enter the first integer:"))
number2 = int(input("Enter the second integer:"))
number3 = int(input("Enter the third integer:"))

total = number1 + number2 + number3
average = total / 3
product = number1 * number2 * number3

smallest = min(number1,number2,number3)
largest = max(number1,number2,number3)

print(f" The sum in {total}")
print(f" The average is {average:.2f}")
print(f" The product is {product}")
print(f" The smallest value is {smallest}")
print(f" The largest value is {largest}")
