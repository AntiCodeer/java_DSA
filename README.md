# java_DSA
Trying To Learn Basic Data Structure Algorithm Using JAVA

- Q1. Findout the Largest No Among Three No's
- Q2. Check Wheather a Chracter is in Uppercase or in Lowercase
- Q3. Check Wheather a Year is in Leap Year or not
- Q4. Solve Fibonacci Series Problem and take no of terms as a input.
- Q5. Check wheather a String or a Number is Palindrome or not.
- Q6. Check wheather a Number is Armstrong Number or not.
- Q7. Leetcode. 1281. Subtract the Product and Sum of Digits of an Integer

Given an integer number n, return the difference between the product of its digits and the sum of its digits.

        Example 1:
        Input: n = 234
        Output: 15
        Explanation:
        Product of digits = 2 * 3 * 4 = 24
        Sum of digits = 2 + 3 + 4 = 9
        Result = 24 - 9 = 15

- Q8. Input a number and print all the factors of that number (use loops)
- Q9. Take integer inputs till the user enters 0 and print the sum of all numbers
- Q10. Take integer inputs till the user enters 0 and print the largest number from all.
- Q11. Factorial Program In Java.
- Q12. Calculate Average Of N Numbers.
- Q13. Calculate Power of a Numbers.
- Q14. Calculate Ncr & Npr.
- Q15. Reverse A String In Java.
- Q16. HCF and LCM Of Two Numbers Program.
- Q17. Check the No of Vowel And Consonent in A String.
- Q18. Check if a number is Perfect No or Not.
- Q19. Check Wheather a Year is a Leap Year or No.
- Q20. xyz is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
- Q21. Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
- Q22. Define a method to find out if a number is prime or not.
- Q23. Define a method to check if a number is Palindrome or not.
- Q24. Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-> 4! = 1 * 2 * 3 * 4 = 24 
- Q25. Write a function that returns all prime numbers between two given numbers.
- Q26. Write a function that returns the sum of first n natural numbers.
- Q27. LeetCode 1920. Build Array from Permutation

Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

    Example 1:

    Input: nums = [0,2,1,5,3,4]
    Output: [0,1,2,4,5,3]
    Explanation: The array ans is built as follows: 
    ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
        = [0,1,2,4,5,3]

- Q28. LeetCode 1929. Concatenation of Array

Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans. 

    Example :

    Input: nums = [1,2,1]
    Output: [1,2,1,1,2,1]
    Explanation: The array ans is formed as follows:
    - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
    - ans = [1,2,1,1,2,1]

- Q29. LeetCode 1480. Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums. 

    Example :

    Input: nums = [1,2,3,4]
    Output: [1,3,6,10]
    Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

- Q30. LeetCode 1672. Richest Customer Wealth

You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
    
    Example :

    Input: accounts = [[1,5],[7,3],[3,5]]
    Output: 10
    Explanation: 
    1st customer has wealth = 6
    2nd customer has wealth = 10 
    3rd customer has wealth = 8
    The 2nd customer is the richest with a wealth of 10.
    
- Q31. LeetCode 1470. Shuffle the Array.

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

    Example :

    Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7] 
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
- Q32. LeetCode 1431. Kids With the Greatest Number of Candies

There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

    Example :

    Input: candies = [2,3,5,1,3], extraCandies = 3
    Output: [true,true,true,false,true] 
    Explanation: If you give all extraCandies to:
    - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
    - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
    - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
    - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
    - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.