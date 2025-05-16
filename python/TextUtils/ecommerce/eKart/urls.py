from django.urls import path
from .views import *
from django.conf import settings
from django.conf.urls.static import static

urlpatterns = [
    path('',index,name='index'),
    path('contact/',contactus,name='contactus'),
    path('about/',aboutus,name='aboutus'),
    path('search/',search,name='search'),
    path('viewprod/',viewprod,name='viewProd'),
]+ static(settings.MEDIA_URL,document_root=settings.MEDIA_ROOT)