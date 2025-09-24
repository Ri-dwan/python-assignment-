fathers_ages = int(input("Enter current father's age (1-80):"))
son_ages = int(input("Enter current age of son (1-80):"))

years = abs (fathers_age -2 * son_age)


if years == 0:
	print("The father is currently twice as old as his son.")
elif father_age > 2 * son_age:
	print(f" The father was twice as old as his son years ago.")

else:	
	print(f"The father will be twice as old as his son in years.")


