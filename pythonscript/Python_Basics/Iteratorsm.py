'''
Created on Aug 26, 2018

@author: Mahesh

Python has two primitive loop commands:

while loops
for loops
The while Loop
With the while loop we can execute a set of statements as long as a condition is true.
'''
i = 0
while i < 6:
    i += 1 
    if i == 3:
        break
    print(i)
  
  
j = 0
while j < 6:
    j += 1 
    if j == 3:
        continue
    print(j)
    
    
    fruits = ["apple", "banana", "cherry"]
for x in range(len(fruits)):
                print(fruits[x])



        