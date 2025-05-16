from django.db import models
import string
import random

# Create your models here.

def code_generator():
    length=6

    while True:
        code=''.join(random.choices(string.ascii_uppercase,k=length))
        if Room.objects.filter(code=code).count==0:
            break

    return code


class Room(models.Model):
    code =models.CharField(max_length=10, unique=True,default="") # 房
    host=models.CharField(max_length=32,unique=True)
    guest_can_pause=models.BooleanField(null=False, default=False)
    vote_to_skip=models.IntegerField(null=False, default=1)
    created_at=models.DateTimeField(auto_now_add=True)
