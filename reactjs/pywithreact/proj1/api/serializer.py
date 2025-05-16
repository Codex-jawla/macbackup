from rest_framework import serializers
from .models import *

class room_serializer(serializers.Serializer):
    class meta():
        models=Room
        feilds=('id','code','host','est_can_pause','vote_to_skip','created_at')