# Curso de introdução ao Spark

## Dockerfile

Primeiramente clone o projeto para uma pasta local

Dentro do diretório onde foi clonado o projeto, faça o build da imagem:

```
$ docker build -t spark-lab .
```

Após um tempo construindo, é importante ressaltar o passo 10:

```
Step 10/10 : CMD spark-submit  --class SimpleApp --master local /App/example-1/target/scala-2.10/simple-project_2.10-1.0.jar
 ---> Running in eefa9244f091
Removing intermediate container eefa9244f091
 ---> 34c0e52c5631
Successfully built 34c0e52c5631
Successfully tagged spark-lab:latest
```

Agora para testar, basta rodar:

```
$ docker run -it spark-lab
Spark assembly has been built with Hive, including Datanucleus jars on classpath
There are 17 lines that contain the word Copyright
```