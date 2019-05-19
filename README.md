# spring-boot docker angular postgres


## Bajarse todos los proyectos desde github


### ingresar a la carpeta Backend-Docker 
mvn clean install -DskipTests

### Construir la Imagen a partir de un Dockerfile
docker build -t "wilgares/backend:1.0.0" .


### Ingresar a la carpeta Backend-Docker-Country
mvn clean install -DskipTests

### Construir la Imagen a partir de un Dockerfile
docker build -t "wilgares/backend-pais:1.0.0" .

### Ingresar a la carpeta Database
### construir la imagen de DB
docker build -t "wilgares/postgres:1.0.0" .


#### ingresar a la carpeta Frontend-Docker
npm install
ng build
### construir la imagen de Frontend
docker build -t "wilgares/frontend:1.0.0" .




### Hacer push de la Imagen al dockerHUB
docker push wilgares/backend:1.0.0
docker push wilgares/backend-pais:1.0.0
docker push wilgares/postgres:1.0.0
docker push wilgares/frontend:1.0.0


## levantar el proyecto docker
##Ingresar a la carpeta Proyecto_Entregable
docker-compose --file docker-compose-local.yml up -d

## Detener los contenedores.
docker-compose --file docker-compose-local.yml down


docker swarm init

## levantar el proyecto docker en swarm
docker stack deploy -c docker-compose-swarm.yml  wgm