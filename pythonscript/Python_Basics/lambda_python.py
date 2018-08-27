'''
Created on Aug 26, 2018

@author: Mahesh


A lambda function is a small anonymous function.

A lambda function can take any number of arguments, but can only have one expression.

Syntax
lambda arguments : expression
The expression is executed and the result is returned:

Example
A lambda function that adds 10 to the number passed in as an argument, and print the result:

x = lambda a : a + 10
print(x(5))
'''

x = lambda a : a + 10
print(x(5))

x = lambda a,b : a * b
print(x(5,6))

x = lambda a,b,c : a +b+c
print(x(5,6,10))

