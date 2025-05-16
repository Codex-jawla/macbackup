import math
# print("yes") if age>=18 else print("no")
# var=("no","yes") [age>=18]
# print(var)


# side=float(input("Enter side of square : "))
# print(f"Area of square of side {side} is ",side*side)

# a=float(input("Enter num 1 : "))
# b=float(input("Enter num 2 : "))
# print(f"average  of {a},{b} is {(a+b)/2}")
# str="vansh"
# print(str[-2])
# str=str.replace("n","")
# print(str)
# print(str[1:4])
# marks =[76,88,70,93,68,98,63]
# print(marks)
# print(marks[2:5])
# marks.sort()
# print(marks)
# marks.sort(reverse=True)
# print(marks)
# marks.append(84)
# print(marks)
# marks.insert(3,81)
# print(marks)
# marks.sort()
# print(marks)
# marks.pop(4)
# print(marks)
# print(len(marks))

# a=input("Enter movie name 1 : ")
# b=input("Enter movie name 2 : ")
# c=input("Enter movie name 3 : ")
# list =[a,b,c]
# print(list)

# ls=[1,2,3,2,2]
# ls2 =ls.copy()
# ls2.reverse()
# print("palindrome") if ls==ls2 else print("not palindrome")

# info ={
#     "name": "Himanshu Jawla",
#     "roll no." : 1114807722,
#     "Batch" : "2021-2025",
#     "branch" : "IT",
#     "group": "I1",
#     "semester" : 6,
#     "Sepecilization": "FSD"
# }
#
# print(info)
# info["cgpe"]=74.67
# print(info)

# a=(1,2,3)
# print(type(a))

# seta = {1,2,4,6,3,4,8}
# print(type(seta))
# print(seta)
# seta.add(7)
# st={6,9,5,4,1}
# aa=seta.intersection(st)
# print(aa)
# print(seta)

# dic={
#     "Table" : ("A piece of furniture","list of facts and figure"),
#     "cat": "animal"
# }
# print(dic)
#
# cls={"python","java","c++","python","javascript","java","python","java","c++","c"}
# print(cls)
# print(len(cls))
# val={int(9),float(9.0)}
# print(val)

# ls = (1,3,9,6,0,4,7,2,6)

# count=0
# while (count<len(ls)):
#     if(ls[count]==9):
#         print(f"index is : {count}")
#         break
#     count+=1

# x=6
# for ele in ls:
#     if(ele==x):
#         print(f"no found at index : {count}")
#         count+=1
#     count+=1
#
# for i in range(2,9,2):
#     print(ls[i])
#
# for i in range(2,101,2):
#     print(i)

# n=int(input("enter any natural no : "))
# sum=0
# for i in range(n+1):
#     sum+=i
# print(sum)

# fact=1
# for i in range(1,n+1):
#     fact*=i
# print(fact)

# def avg(a,b,c):
#     return (a+b+c)/3
#
# print(avg(35,430,305))

# def siz(ls):
#     count=0
#     for i in ls:
#         count+=1
#     return count
#
# ls=[1,2,3,2,2]
# print(siz(ls))

# def findConsequtiveOnes(list):
#     maxconsequetive=0
#     count=0


# age=int(input("enter your age : "))
#
# if(age>=18):
#     print("you are eligible for voting")
# else:
#     print("you are under age")
#
#
# m=int(input("Enter first value "))
# n=int(input("Enter divisor value "))
# try:
#     a=m/n
#     print(a)
# except:
#     print("Error occur divide by zero")
#
# f=int(input("Enter value "))
# i=1
# fact=1;
# while(i<=f):
#     if(f==0):
#         fact=1
#     fact*=i
#     i+=1
# print(fact)
#
# name=input("Enter name")
# age=int(input("Enter age "))
#
# print(f"Your name is {name} and your age is {age}")
#
# r=int(input("Enter Radius of circle : "))
# def area(r) ->float:
#     return math.pi * r**2
# #
#
# print("Area of circle : " ,area(r))
#
# ls =[]
# while(True):
#     value=int(input("Enter value to add in list and 0 to exit : "))
#     if(value==0):
#         break
#     ls.append(value)
# ls.sort()
# print(ls)
#
# name=input("Enter name : ")

# def reverse(name):
#     str = ""
#     for i in name:
#         str = i + str
#     return str
#
# print(reverse(name))


# import datetime
# def print_date():
#     current_time = datetime.datetime.now()
#     month_names = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
#     day_names = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday']
#     year = current_time.year
#     month = current_time.month
#     day = current_time.day
#     hour = current_time.hour
#     minute = current_time.minute
#     second = current_time.second
#     day_of_week = current_time.weekday()
#
#     formatted_date = f"{day_names[day_of_week]} {month_names[month - 1]} {day} {hour}:{minute}:{second} IST {year}"
#     print(formatted_date)
#
# print_date()
#
# mylist = []
# mylist.append(1)
# mylist.append(2)
# mylist.append(3)
# print("List appending element:", mylist)
# mylist.remove(2)
# print("List after removing element:", mylist)


# Creating a tuple
# mytuple = (1, 2, 3, 'a', 'b', 'c')
# print(mytuple)
#
# print("Sliced tuple:", mytuple[2:5])
# print("Length of the tuple:", len(mytuple))
# tuple1 = (1, 2, 3)
# tuple2 = ('a', 'b', 'c')
# concat_tuple = tuple1 + tuple2
# print("Concatenated tuple:", concat_tuple)
# repeated_tuple = tuple1 * 3
# print("Repeated tuple:", repeated_tuple)
# print("Is 'a' in the tuple?", 'a' in mytuple)
# print("Number of occurrences of 'a':", mytuple.count('a'))
# print("Index of 'b':", mytuple.index('b'))

#
# my_dict = {'name': 'Himanshu', 'age': 20, 'city': 'Delhi'}
# print(my_dict)
#
# my_dict['age'] = 25
# print("Updated age:", my_dict['age'])
#
# my_dict['country'] = 'India'
# print("Dictionary after adding a new key-value pair:", my_dict)
#
# removed_value = my_dict.pop('city')
# print("Removed value:", removed_value)
# print("Dictionary after removing a key-value pair:", my_dict)
#
# print("Length of the dictionary:", len(my_dict))
# print("Does 'name' exist in the dictionary", 'name' in my_dict)
#
# my_dict.clear()
# print("Dictionary after clearing:", my_dict)
#
#
# def fahrenheit(C):
#     F = (C * 9/5) + 32
#     print(f"{C} degrees Celsius is equal to {F} degrees Fahrenheit.")
#
# def celsius(F):
#     C = (F - 32) * 5/9
#     print(f"{F} degrees Fahrenheit is equal to {C} degrees Celsius.")
#
# temp_in_Celsius = 37
# fahrenheit(temp_in_Celsius)
#
# temp_in_Fahrenheit = 77
# celsius(temp_in_Fahrenheit)


# def is_right_triangle(side1, side2, side3):
#     sides = [side1, side2, side3]
#     sides.sort()
#     if sides[2] ** 2 == sides[0] ** 2 + sides[1] ** 2:
#         return True
#     else:
#         return False
#
# side1 = float(input("Enter the length of the first side: "))
# side2 = float(input("Enter the length of the second side: "))
# side3 = float(input("Enter the length of the third side: "))
#
# if is_right_triangle(side1, side2, side3):
#     print("It is a right triangle.")
# else:
#     print("It is not a right triangle.")

# from hell import greet
# name = input("Enter your name : ")
# greet(name)

# class IntegerToRoman:
#     def roman(self, num):
#         symbols = {
#             1: 'I', 4: 'IV', 5: 'V', 9: 'IX', 10: 'X',
#             40: 'XL', 50: 'L', 90: 'XC', 100: 'C',
#             400: 'CD', 500: 'D', 900: 'CM', 1000: 'M'
#         }
#
#         result = ''
#         for value in sorted(symbols.keys(), reverse=True):
#             while num >= value:
#                 result += symbols[value]
#                 num -= value
#
#         return result
#
# converter = IntegerToRoman()
# number = int(input("Enter an integer: "))
# romanvalue = converter.roman(number)
# print("Roman number:", romanvalue)
name=input("what is your name")
age = input("what is your age")
print(f"my name is {name}! i am {age} years old")

#
# def reversestr(s):
#
#     words = s.split()
#     reverse_words = words[::-1]
#     revers_string = ' '.join(reverse_words)
#
#     return revers_string
#
# enterstr = input("Enter a string: ")
# reversed_string =reversestr(enterstr)
# print("Reversed string:", reversed_string)

# from datetime import datetime
# import pytz
#
# india_timezone = pytz.timezone("Asia/Kolkata")
# current_time = datetime.now(india_timezone)
# formatted_time = current_time.strftime("%a %b %d%H:%M:%S %Z %Y")
# print(formatted_time)




# print("matrix multiplication")
#
# def matrix_multiply(A, B):
#     if len(A[0]) != len(B):
#         raise ValueError("Number of columns in the first matrix must equal the number of rows in the second matrix.")
#
#     result = [[0 for _ in range(len(B[0]))] for _ in range(len(A))]
#
#     for i in range(len(A)):
#         for j in range(len(B[0])):
#             for k in range(len(B)):
#                 result[i][j] += A[i][k] * B[k][j]
#
#     return result
# A = [ [1, 2, 3],[4, 5, 6],]
# B = [[7, 8],  [9, 10], [11, 12],]
#
# C = matrix_multiply(A, B)
#
# for row in A:
#     print(row)
# for row in B:
#     print(row)
# for row in C:
#     print(row)
#
# number = int(input("Enter a number: "))
# factorial = 1
# for i in range(1, number + 1):
#     factorial *= i
#
# print("The factorial of", number, "is", factorial)

# import math
#
# def calculate_circle_area(radius):
#     area = math.pi*radius**2
#     return area
#
# radius = float(input("Enter the radius of the circle: "))
# area = calculate_circle_area(radius)
# print("The area of the circle is:", area)


# class Car:
#     def __init__(self, make, model, year):
#         self.make = make
#         self.model = model
#         self.year = year
#
#     def get_description(self):
#         return f"{self.year} {self.make} {self.model}"
#
#
# my_car = Car("Mahindra", "Scorpio Classic", 2023)
#
# print("Car details:", my_car.get_description())

# import re
#
# email_pattern = r'\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Z|a-z]{2,}\b'
#
# with open("sample_text.txt", "r") as file:
#     text = file.read()
#
# emails = re.findall(email_pattern, text)
#
# print("Found email addresses:")
# for email in emails:
#     print(email)

# try:
#     num1 = float(input("Enter the first number:"))
#     num2 = float(input("Enter the second number: "))
#     result = num1 / num2
# except ZeroDivisionError:
#     print("Division by zero is not allowed.")
# except ValueError:
#     print("Invalid input. Please enter a number.")
# except:
#     print("An unexpected error occurred.")
# else:
#     print(f"{num1} / {num2} = {result}")
# finally:
#     print("The program has finished execution.")

#
# import pandas as pd
# import matplotlib.pyplot as plt
#
# data = pd.read_csv("data.csv")
#
# x = data["x"]
# y = data["y"]
#
# plt.plot(x, y, marker='o', linestyle='-', color='b')
# plt.xlabel("X Axis")
# plt.ylabel("Y Axis")
# plt.title("Data Visualization")
# plt.show()
#

# import tensorflow as tf
# from tensorflow import keras
# from tensorflow.keras.preprocessing import image
# from tensorflow.keras.applications.mobilenet_v2 import MobileNetV2, preprocess_input, decode_predictions
# import numpy as np
#
# model = MobileNetV2(weights='imagenet')
#
# img_path = 'sample_image.jpg'
# img = image.load_img(img_path, target_size=(224, 224))
# img_array = image.img_to_array(img)
# img_array = np.expand_dims(img_array, axis=0)
# img_array = preprocess_input(img_array)
#
# predictions = model.predict(img_array)
# decoded_predictions = decode_predictions(predictions, top=3)[0]
#
# for prediction in decoded_predictions:
#     print(f"Class: {prediction[1]}, Confidence: {prediction[2]:.2f}")
