from ..models import Post
from rest_framework import serializers

class postSerializer(serializers.HyperlinkedModelSerializer):
    class Meta:
        model = Post
        fields = ['id','name','details']