'''
Created on Aug 15, 2018

@author: Mahesh
'''

from selenium import webdriver


driver=webdriver.Chrome("G:\\lib\\chromedriver.exe")
driver.get("http://facebook.com")
driver.find_element_by_id("")
driver.get_screenshot_as_file("mahesh.png")
driver.close()
