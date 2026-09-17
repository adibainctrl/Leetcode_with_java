# Palindrome Number

## PROBLEM

Given an integer x, return true if x is a palindrome, and false otherwise.

A palindrome numbers reads the same forward and backward.
For example, 12321.

## APPROACH

Firstly, I reverse the number and then compare it to the original number. If they match then the given number is a Palindrome number otherwise it is not.

Negative numbers are not considered palindrome numbers.

## EXAMPLE:

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

## TIME COMPLEXITY: O(log x)
## SPACE COMPLEXITY: O(1)
