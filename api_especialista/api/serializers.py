from rest_framework import serializers
from api.models import Especialista, TipoEspecialista

class EspecialistaSerializer (serializers.ModelSerializer):
    class Meta:
        model = Especialista
        fields = "__all__"

class TipoEspecialistaSerializer (serializers.ModelSerializer):
    class Meta:
        model = TipoEspecialista
        fields = "__all__"
