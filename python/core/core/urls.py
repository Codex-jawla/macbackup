"""
URL configuration for core project.

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/5.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
from home.views import *

urlpatterns = [
    path('admin/', admin.site.urls),
    path('',index,name ="index"),
    path('contact',contact,name='contact'),
    path('student',student,name='student'),
    path('login',login_page,name='login'),
    path('signup',signup,name='signup'),
    path('logout',log_out,name='logout'),
    path('about',about,name='about'),
    path('fdata',fakedata,name='fake'),
    path('fmarks',marksdata,name='mark'),
    path('stuinfo/<student>',stuInfo,name='info'),
    path('delete/<email>',delete,name='delete'),
    path('update/<email>',update,name='update')
]
