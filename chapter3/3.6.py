print("Hello. I am simple medical diagnostic bot. What is your problem?")
input1 = input()

print("Have you had this problem before (yes or no)?")

input2 = input()

if input1 == 'yes':
	print("Well, you have it again.")
elif input2 == 'no':
	print("Well, you have it now.")
else:
	print("I didn't understand that. let's move on.")
