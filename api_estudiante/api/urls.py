from rest_framework.routers import DefaultRouter
from api.views import EstudianteViewSet

router= DefaultRouter()

router.register('api/estudiante',EstudianteViewSet)

urlpatterns = []
urlpatterns += router.urls

