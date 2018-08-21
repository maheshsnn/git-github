'''
Created on Aug 15, 2018

@author: Mahesh
'''

from selenium import webdriver
import test

driver=webdriver.Chrome("G:\\lib\\chromedriver.exe")
driver.get("http://facebook.com")
driver.get_screenshot_as_file("mahesh.png")
driver.close()
