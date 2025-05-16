from django.contrib import messages
from django.contrib.auth import authenticate , login as auth_login
from django.contrib.auth.decorators import login_required
from django.shortcuts import render, redirect
from .models import Product
from math import ceil

@login_required
def index(request):
    data = Product.objects.all()
    n = len(data)
    numslide = ceil(n/4) - 1
    param = {'queryset': data,
             'range' : range(1,numslide),
             }

    return render(request, 'eKart/index.html', param)

def contactus(request):
    param = {'Title': 'E-commerce'}
    return render(request, 'eKart/index.html', param)

def aboutus(request):
    param = {'Title': 'E-commerce'}
    return render(request, 'eKart/index.html', param)

def search(request):
    param = {'Title': 'E-commerce'}
    return render(request, 'eKart/index.html', param)

def viewprod(request):
    param = {'Title': 'E-commerce'}
    return render(request, 'eKart/index.html', param)

# Create your views here.

def login(request):
    if request.method == 'POST':
        email=request.POST.get('email')
        password=request.POST.get('password')

        if not User.objects.filter(username=email).exists():
            messages.warning(request, "no user registered")
            return redirect('login')

        user = authenticate(username=email, password=password)

        if user is None:
            messages.error(request, "invalid username or password")
            return redirect("login")
        else:
            auth_login(request, user)
            return redirect('/')


    return render(request,'eKart/login.html')


from django.contrib.auth.models import User
def register(request):

    if request.method == 'POST':
        fname=request.POST.get('firstname')
        lname=request.POST.get('lastname')
        email=request.POST.get('email')
        password=request.POST.get('password')

        user = User.objects.filter(username = email)

        if user.exists():
            messages.warning(request, "Email already exists")
            return redirect('register')

        user = User.objects.create(
            first_name=fname,
            last_name=lname,
            username=email
        )
        user.set_password(password)
        user.save()

        messages.success(request, "SignUp successful")
        return redirect('login')



    return render(request,'eKart/register.html')