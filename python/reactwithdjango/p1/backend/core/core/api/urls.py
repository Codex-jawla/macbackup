from posts.api.views import PostViewSet
from django.urls import include, path
from rest_framework import routers


router = routers.DefaultRouter()
router.register(r'posts', PostViewSet)


urlpatterns = [
    path('', include(router.urls)),
]