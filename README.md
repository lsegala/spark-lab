# Curso de introdução ao Spark

## Dockerfile

Primeiramente clone o projeto para uma pasta local

Aqui há duas opções:
* Realize o download dos arquivos que estão no arquivo Dockerfile para sua pasta
* Descomente a linha onde há os comandos curl e comente a linha do comando COPY

Agora basta testar o funcionamento:
```
$ docker build -t spark-lab .
$ docker run -it spark-lab
$ spark-shell
```
