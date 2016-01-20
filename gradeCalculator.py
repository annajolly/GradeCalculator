#!/usr/bin/python

import sys
import cgi

form = cgi.FieldStorage()

"""
precondition: worth is out of 100, grade is out of 1
"""

def addGradeToList(list, grade, worth):
    item = grade.toFloat * worth.toFloat
    list.append(item)
    return list

def Calculate(grade, list, finalWorth):
    r = 85
    for item in list:
        r = r - item.toFloat
    r = r/finalWorth
    return r
    
def main():
    


main()
