from rest_framework.routers import DefaultRouter
from api.views import EspecialistaViewSet, TipoEspecialistaViewSet

router = DefaultRouter()

router.register('api/especialista', EspecialistaViewSet)
router.register('api/tipoEspecialista', TipoEspecialistaViewSet)

urlpatterns = []

urlpatterns += router.urls