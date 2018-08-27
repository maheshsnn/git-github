'''
Created on Aug 26, 2018

@author: Mahesh

A function is a block of code which only runs when it is called.

You can pass data, known as parameters, into a function.

A function can return data as a result.

Creating a Function
In Python a function is defined using the def keyword:

Example

'''

def my_function():
            print("Hello from a function without parameter")
            print("function should be declared by using def without parameter")

def my_functions(names):
            print("Hello from a function with paarameter")
            print("function should be declared by using def paramter")
  
my_function()
my_functions("email")
