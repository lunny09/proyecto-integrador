from django.db import models

# Create your models here.

class TipoEspecialista (models.Model):
    tipo = models.CharField(max_length=80)

class Especialista (models.Model):
    nombres = models.CharField(max_length=80)
    apellidos = models.CharField(max_length=80)
    cedula = models.IntegerField()
    telefono = models.IntegerField()
    genero = models.CharField(max_length=80)
    correo = models.CharField(max_length=80)
    tipo = models.ForeignKey(TipoEspecialista, on_delete=models.PROTECT)