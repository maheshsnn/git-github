'''
Created on Aug 26, 2018

@author: Mahesh


A list is a collection which is ordered and changeable. In Python lists are written with square brackets.

Example
Create a List:


'''


thislist = ["apple", "banana", "cherry"]
print(thislist)
print("The first element in the list is "+thislist[1])


#Change the second item:

thislist = ["apple", "banana", "cherry"]
thislist[1] = "blackcurrant"
print(thislist)

'''
The list() Constructor

It is also possible to use the list() constructor to make a list. To add an item to the list use append() object method. To remove a specific item use the remove() object method. The len() function returns the length of the list.

Example
Using the list() constructor to make a List:
'''

thislist = list(("apple", "banana", "cherry")) # note the double round-brackets
print(thislist)
thislist.append("mahesh")
print(thislist)


'''
append()    Adds an element at the end of the list
clear()    Removes all the elements from the list
copy()    Returns a copy of the list
count()    Returns the number of elements with the specified value
extend()    Add the elements of a list (or any iterable), to the end of the current list
index()    Returns the index of the first element with the specified value
insert()    Adds an element at the specified position
pop()    Removes the element at the specified position
remove()    Removes the first item with the specified value
reverse()    Reverses the order of the list
sort()    Sorts the list
'''

thislist.copy();
thissecondlists=[1,2,3,4]
thislist.extend(thissecondlists)
print(thislist)

fruits=[1,2,3,4]
cars=[5,6,7,8]
fruits.extend(cars)
print(fruits)

fruits.reverse()
print(fruits)

months=['ac','ab','ad']
monthsnum=[1,2,4,3,6,5] 
monthsnum.sort()
months.sort()
monthsnum.sort()

print(months)
print(monthsnum)























