from rest_framework import serializers
from api.models import Estudiante

class EstudianteSerializer(serializers.ModelSerializer):
    class Meta:
        model=Estudiante
        fields="__all__"