'''
Created on Aug 26, 2018

@author: Mahesh

Dictionary
A dictionary is a collection which is unordered, changeable and indexed. In Python dictionaries are written with curly brackets, and they have keys and values.

dictonaries are similar to that of hashmap

Example
Create and print a dictionary:

'''



thisdict =    {
  "apple": "green",
  "banana": "yellow",
  "cherry": "red"
}

thisdict.setdefault("month", "january")
print(thisdict.get("month"))
print(thisdict.get("apple"))
