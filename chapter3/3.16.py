largest1 = 0
largest2 = 0


for i in range(10):
	number = int(input(f"Enter any number:"))

	if number > largest:
		largest = largest
		largest = number
	else: number > largest
		largest = number

print(f"\nThe two largest value are {largest1} and {largest2}")