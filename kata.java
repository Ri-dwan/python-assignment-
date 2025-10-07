
public class kata {
public static boolean isPrime(int number){
int factorcount = 0;
int div = 1;
int num = 0;
while(div <= num){
int divisor = div % num; 
if(divisor == 0){
}
factorcount += 1;
div += 1;
}
return"FactorCount";
}
System.out.println("The factor count is :" + FactorCount);
}

public static Boleean isPrime(int number){
return True / False;

}

public static booleen isOdd(int number) {
if(number %2 ! = 0 ){

return True;
 
	else False;


  }
    
}

public static boolean isLeapYear(int year){

 if(( year % 4 == 0) && year % 100 !=0){
  return true;
}
if(( year % 4 == 0) && year % 100 == 0) {
  if( year % 400 == 0){
  return true;
}

else 
    return false;
}




public static double converstion(double fahrenheint){

	double celisu =  5*(fahrenheint-32)/9;
	
	return celisu;

}
}


public static int numberOfFactors(){

int counter = 0;

	for (int count =1; count <= number to check; count++){
	if (number % count ==0){
		counter++;
	}
	
}
	return counter;

}

public static boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }


   
public static long factorialOf(int number) {
        if (number < 0) {
            return 0;
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }