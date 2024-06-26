# training_code_dump
This repository contains all the codes done as tasks or exercises for the Technical Training Session provided by DLithe at my college.

 
#password.java

Give a string (password). And check if it is a valid password as per given following rules if yes print 1 else print 0

Rules:
Password should  be a minimum of 8 characters in length .
Password should contain at least one uppercase , one lower case , one special character and one digit 
It should not contain white space.

#lucky_sum.java

Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1


#noTeenSum.java

Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3


#Green_Ticket.java

You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.

greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10

#lastDigit.java

Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
 
lastDigit(7, 17) → true
lastDigit(6, 17) → false   
lastDigit(3, 113) → true
 
#Even.java

Given one integer n and return true if it is an even number else return false.
Even(6) -> True.
Even(7) -> False.
Even(9) -> False. 

#sumDouble.java

Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8 
 
#makes10.java

Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
 
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 
#A_in1020.java

Given 2 int values, return true if either of them is in the range 10..20 inclusive.
 
in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false

#Zero_conv.java

Zero Converter:
You are given a number n. The number n can be negative or positive. If n is negative, print numbers from n to 0 by adding 1 to n in the neg function. If positive, print numbers from n-1 to 0 by subtracting 1 from n in the pos function.
Note:- You don't have to return anything, you just have to print the array.
Example 1:
Input:
n = 0
Output:
already Zero
 
Example 2:
Input:
n = 4
Output:
3 2 1 0
 
Example 3:
Input:
n = -3
Output:
-3 -2 -1 0
 Your Task:
This is a function problem. You need to take input of test cases. Just complete the functions pos() and neg().

#ATM.java

Write a simple ATM Program to display the following options and perform the user-selective operation until the user exits from the program.
· Initial account pin is 1234 and the balance of the user is 0.
· Read the PIN from the user and if it matches then print and execute the following operations as per user selection.
1. Deposit
2. Withdraw
3. Balance enquiry
4. PIN change
5. Exit
· Return the total available balance after the deposit.
· Return the total available balance after the withdrawal.
· Return the total available balance after the Balance check.
· Return “PIN Change” after the pin change operation.
Transaction(1) : input: 5000 output:5000

#Sumprime.java

Given two int values a and b. Check a and b are primes are not. If a and b are primes then check if the sum of a and b is a prime or not. If the prime returns true. Else return false.
SumPrime(2,3) —> true.
SumPrime(7,11) —> true.
 SumPrime(3,7) —> false
SumPrime(8,11) → false
 
#Stringtimes.java

Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"

#count_special.java

Write a Java program to count and display the number of special characters from a given string.

#prime_array_1st.java

Write a Java program to arrange all prime elements first and nonprime elements next from the given
array.

#prime_check_sum_prime.java

Write a Java program to check whether a given number is prime. If prime, find the sum of its digits and
then check it is a prime. If Prime returns 1 else return 0.

#major_ele.java

Write a Java program to find the majority element from the given array.

#vowel_string.java

Implement a Java program that reads an array of strings from the user, where each string represents a word. The program should then determine and display the word from the array that contains the highest number of vowels. Your program should output only the word with the maximum number of vowels. If multiple words have the same maximum number of vowels, output all such words. Provide the complete Java code for your program, including necessary imports and method definitions.

#special_array.java

Write a Java program that reads an array of strings from the user, where each string represents a sentence. The program should then determine and display the sentence from the array that contains the highest number of special characters. 

#pos_array_sameprime.java

Write a Java program that prompts the user to enter the length of an integer array and then input the elements of the array. The program should identify whether there exist two or more prime numbers in the array with the same number of digits. If such prime numbers exist, the program should output true; otherwise, it should output false.

#roman_2_int.java

Roman numerals are represented by seven different symbols: I, V, X, L, C, D, and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written from largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

#matrix_zero.java

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

You must do it in place.

