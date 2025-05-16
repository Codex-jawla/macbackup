
marks= [23,43,23,44,54,21]

print(marks)
print(len(marks))
marks.sort()
print(marks)
marks[2]=12
print(marks)

a= int(input('enter any number'))

for i in range(1,5):
    print(a,"X ",i,"=",a*i)

i=4
while i>0:
    print(a,"X ",i,"=",a*i)
    i-=1


def fib(n):
    ''' this  is a fibonacci series function used to get the value of any specific position'''
    if n<2:
        return n
    return fib(n-1) + fib(n-2)


print(fib(26))
print(fib.__doc__)
# jan      feb      mar     apr     may     jun     jul     aug     sep     oct     nov     dec          p2
# 1        2        4       8       16      32      64      128     256      512    1024    2048         2b
# 4096     8192     16384   32768   65536   131072  262k    524k    1048k   2096k   4192k   8384k        4b
# 16.6m    33.2m    66.4m   132.8m  266m    532m    1.06b   2.12b   4.24b   8.48b   16.96b  33.92b       8b