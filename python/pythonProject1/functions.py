# def func(name):
#     print(f"My name is {name}")
#
# func("Himanshu Jawla")
#
# def reading_counter(readings) -> int:
#     sum=0
#     if readings<=500:
#         sum=readings*2
#     elif readings<=700:
#         sum=readings*5
#     elif readings<=1000:
#         sum=readings*8
#     else:
#         sum=readings*13
#
#     return sum
#
# h1=reading_counter(480)
# print(h1)
# h2=reading_counter(540)
# print(h2)
# h1=reading_counter(1480)
# print(h1)
# h1=reading_counter(984)
# print(h1)
import forloop


# name ="Himanshu Jawla is my name and i am 20 years old"
# print(name)
# print(name[13])
# print(name[::-1])
# print(name[0:len(name):2])

# list = [1,2,3,4,5,6,7,8,9,10]
# sum=1
# for i in list:
#     sum*=i
#
# print(sum)


# f = open("p1.jpg","rb")
# data = f.read(20)
# print(data)

# with open("pratice.txt","w") as f:
#     f.write("Hi everyone \nwe are learning FILE I/O")
#     f.write("\nusing java\nI like java programming")
#
# with open("pratice.txt","r") as f:
#     data = f.read()
#     newdata = data.replace("java","Python")
#     print(newdata)
#
# with open("pratice.txt","w") as f:
#     f.write(newdata)
#
# with open("pratice.txt","r") as f:
#     data = f.read()
#     print("learning" in data)
# import os
# try:
#     os.remove("pratice.txt")
# except Exception as e:
#     print(e)

# list =[1,2,3,9,3,45,35,53,934,854,49]
# for index ,val in enumerate(list):
#     print(val," on index ",index)
import requests

# def filewrite(filename, list):
#     try:
#         with open(filename, 'a+') as f:
#             f.write(str(list))
#             f.write("\n")
#     except FileNotFoundError as e:
#         print(f"{filename} not found error occurred {e}")
#
# def wirteimg(filename,responce):
#     try:
#         with open(filename,'wb') as f:
#             f.write(responce.content)
#     except FileExistsError as e:
#         print('error occur',e)


# num = int(input("enter your number : "))
# table = [num * i for i in range(1, 11)]
# filewrite("table", table)
# from math import sqrt
# def calchypotenus(p,b):
#      h = sqrt((p**2+b**2))
#      return h
#
# print(f"hypotnues is : {calchypotenus(3,4)}")

# inpString = input("enter your string : ")
# revString = inpString[::-1]
# if inpString == revString:
#     print("string is palindrome")
# else:
#     print("string is not palindrome")