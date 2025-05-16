from django.contrib import admin

from home.models import *

# Register your models here.

admin.site.register(Student)
admin.site.register(Subject)
class SubjectMarkAdmin(admin.ModelAdmin):
    list_display = ['student', 'subject' , 'marks']


admin.site.register(student_Marks,SubjectMarkAdmin)