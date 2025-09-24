# prompt a user to write a program which calculate the average of three score and determine the latter grade based on the average score A,B,C,D and E.


score1 = int(input("Enter the first score 0-100:"))
score2 = int(input("Enter the second score 0-100:"))
score3 = int(input("Enter the third score 0-100:"))

average_score = ( score1 + score2 + score3) /3

if  90 <= average_score <= 100: 
	     print("A")
elif 80 <= average_score <= 90:
	      print("B")
elif 70 <= average_score <= 80:
	      print("C")
elif 60 <= average_score <= 70:
	      print("D")
else: 
	     print("F")