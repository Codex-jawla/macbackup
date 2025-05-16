from django.urls import path
from  .views import *

urlpatterns = [
    path('home',roomview.as_view()), 
]