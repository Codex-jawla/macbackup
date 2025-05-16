from django.db import models

# Create your models here.

class Post(models.Model):
    name = models.CharField(max_length=30)
    details = models.CharField(max_length=50)

    def __str__(self):
        return f" Posts {self.name}"
    