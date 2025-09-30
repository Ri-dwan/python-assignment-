#The code will print a pattern of < and > characters.
#The outer for loop iterates 10 times(row will be 0 to 9) and the if statement if row % 2==1 check if the current row number is odd, and if odd it will print >10 times and if row is even it will print <10 times.


for row in range(10):
   for column in range(10):
	   print('<' if row % 2 == 1 else '>', end='')
print()