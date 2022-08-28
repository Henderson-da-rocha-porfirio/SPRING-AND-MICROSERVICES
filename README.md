# Actuator - Dependência
## Verificando Métricas e Status através do Endpoint "/actuator" que é criado quando adiciono a dependência correspondente.

## Maneira de verificar pelo Postman ou Navegador:
````
http://localhost:8080/actuator
````

## Verificando o Status do Serviço REST:
````
http://localhost:8080/actuator/health
````
## Resposta se estiver tudo certo ( UP e Running ):
````
{
    "status": "UP"
}
````
## Habilitar todos os Endpoints do Actuator:
### Adicionar no application.properties:
````
management.endpoints.web.exposure.include=*
````