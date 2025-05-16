import os

class Car:
    def __init__(self,model,brand,milage):
        self.model = model
        self.brand = brand
        self.milage = milage

    def data(self):
        print("car model:",self.model,"\ncar brand:",self.brand,"\ncar milage:",self.milage)

bmw = Car('640d','bmw',24)

bmw.data()
print(os.getcwd())