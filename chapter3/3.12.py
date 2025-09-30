
number = int(input("Enter a five_number:"))


number1 = number // 10000
number2 = number //1000 % 10
number3 = number //100 % 10
number4 = number // 10 % 10
number5 = number % 10

if number1 == number5 and number2 == number4:
	print(f"{number} is a palindrom.")
else: 
	print(f"{number} is not a palindrom.")