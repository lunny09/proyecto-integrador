from rest_framework import viewsets

from api.models import Estudiante
from api.serializers import EstudianteSerializer

class EstudianteViewSet (viewsets.ModelViewSet):
    serializer_class = EstudianteSerializer
    queryset = Estudiante.objects.all()