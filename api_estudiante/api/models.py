from django.db import models

class Estudiante (models.Model):
    cedula = models.IntegerField()
    nombres= models.CharField(max_length=80)
    apellidos= models.CharField(max_length=80)
    correo= models.CharField(max_length=40)
    carrera= models.CharField(max_length=80)
    paralelo= models.CharField(max_length=10)
    jornada= models.CharField(max_length=20)
    telefono= models.FloatField()
    
    

   

    
