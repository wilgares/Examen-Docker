# spring-boot docker angular postgres


## Bajarse todos los proyectos desde github
git clone https://github.com/wilgares/Examen-Docker.git

## ingresar a la carpeta raiz
cd Examen-Docker/



### por proyecto ingresar a cada carpeta y construir el proyecto
### ===============================================================



## ingresar a la carpeta 
cd Backend-Docker 
mvn clean install -DskipTests

## Construir la Imagen a partir de un Dockerfile
docker build -t "wilgares/backend:1.0.0" .



### Ingresar a la carpeta 
cd Backend-Docker-Country
mvn clean install -DskipTests

### Construir la Imagen a partir de un Dockerfile
docker build -t "wilgares/backend-pais:1.0.0" .



### Ingresar a la carpeta 
cd Database
### construir la imagen de DB
docker build -t "wilgares/postgres:1.0.0" .



#### ingresar a la carpeta 
cd Frontend-Docker
npm install
ng build
### construir la imagen de Frontend
docker build -t "wilgares/frontend:1.0.0" .



#### estos pasos solo se consideran si se ha realizado cambios al codigo
### Hacer push de la Imagen al dockerHUB
docker push wilgares/backend:1.0.0
docker push wilgares/backend-pais:1.0.0
docker push wilgares/postgres:1.0.0
docker push wilgares/frontend:1.0.0


## inicializar docker swarm :  docker swarm init
## levantar el proyecto docker en swarm
## localizarse en la carpeta Examen-Docker/
docker stack deploy -c docker-compose-swarm.yml  wgm

## abrir un navegador y ejecutar:
http://localhost:8080


## Detener los servicios
docker service rm wgm_backend wgm_backend-pais wgm_database wgm_frontend



# si se desea levantar el proyecto sin swarm
# ===========================================
## levantar el proyecto docker
##Ingresar a la carpeta Proyecto_Entregable

docker-compose --file docker-compose-local.yml pull

docker-compose --file docker-compose-local.yml up -d

## Detener los contenedores.
docker-compose --file docker-compose-local.yml down


