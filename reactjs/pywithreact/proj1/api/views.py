from django.shortcuts import render
from rest_framework import generics
from .serializer import *

# Create your views here.

class roomview(generics.ListAPIView):
    queryset = Room.objects.all()
    serializer_class=room_serializer

