'''
Created on Aug 26, 2018

@author: Mahesh
'''


mytuples=("mahesh","bethi","Mokshitha")


myitr=iter(mytuples)

for x in range(len(mytuples)):

                            print(next(myitr))