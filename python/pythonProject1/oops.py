# class student:
#     def __init__(self,name,age,marks):
#         self.name=name
#         self.age=age
#         self.marks=marks
#
#     @staticmethod
#     def hello():
#         print("hello")
#
#     def avg(self):
#         sum=0
#         for val in self.marks:
#             sum+=val
#         print(f"Hi, {self.name} your avg score is : {sum/5}")
#
# s1=student('himanshu jawla',21,[87,73,93,88,69])
# s1.avg()
# s1.hello()


import random

print("Guess game 1-100")
number= random.randint(1,100)
count=0
while True:
    try:
        guess=int(input("enter your guess : "))
        if guess==number:
            count += 1
            print("You guess it right after ",count," turn")
            print("---Game Over----")
            break
        elif guess>number:
            print("You guess a large number")
            count+=1
        elif guess<number:
            print("You guess a small number")
            count+=1
    except Exception as e:
        print("Enter interger value only")


