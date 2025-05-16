from rest_framework import routers
from .views import PostViewSet

postrouter = routers.DefaultRouter()
postrouter.register(r'posts', PostViewSet)