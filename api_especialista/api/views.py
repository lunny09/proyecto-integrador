from django.shortcuts import render
from rest_framework import viewsets
from api.models import Especialista, TipoEspecialista
from api.serializers import EspecialistaSerializer, TipoEspecialistaSerializer


class EspecialistaViewSet (viewsets.ModelViewSet):
    serializer_class = EspecialistaSerializer
    queryset = Especialista.objects.all()

class TipoEspecialistaViewSet (viewsets.ModelViewSet):
    serializer_class = TipoEspecialistaSerializer
    queryset = TipoEspecialista.objects.all()


# Create your views here.

