# Docker + Python
## Creamos un contenedor sencillo de pyhton

'$ docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp python:3 python script.py'

'docker' el comando base, es el daemon

'run' crear el contenedor

'-it' dos opciones que me valen para interactuar con la terminal del contenedor

'--rm' borra el contenedor cunado finaliza la acción

'-v' define el mapeo del volumen a continuación

    - "$PWD" el directorio donde estamos
    - /usr/src/myapp el directorio dentro del contenedor

'-w' el directorio de trabajo (workdir)

'python:3' la imagen de la que se creará el contenedor

'python script.py' es el comando para ejecutar dentro del contenedor

---

En caso de errores debemso atender a la consola, la cual explicará en que consisten. Si los contenedores docker está ocupados debe cambiartse el nombre dfel nuevo contenedor o eliminar el anterior usando `docker rm (nombre o id del conteiner)`. Si da problemas sobre postgres, se debe para el servicio ejecutando `service postgresql stop`