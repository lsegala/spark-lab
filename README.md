# Curso de introdução ao Spark

## Dockerfile

Primeiramente clone o projeto para uma pasta local

Dentro do diretório onde foi clonado o projeto, faça o build da imagem:

```
$ docker build -t spark-lab .
```

Após um tempo construindo, é importante ressaltar o passo 11:

```
Step 11/11 : CMD spark-submit  --class $MAIN_CLASS --master local /App/example-1/target/scala-2.10/simple-project_2.10-1.0.jar
 ---> Running in eefa9244f091
Removing intermediate container eefa9244f091
 ---> 34c0e52c5631
Successfully built 34c0e52c5631
Successfully tagged spark-lab:latest
```

Agora se rodarmos, por padrão a classe SimpleApp será utilizada

```
$ docker run -it spark-lab
Spark assembly has been built with Hive, including Datanucleus jars on classpath
There are 17 lines that contain the word Copyright
```

Ou podemos passar a classe desejada:

```
$ docker run -e "MAIN_CLASS=ParallelCollection" -it spark-lab
Spark assembly has been built with Hive, including Datanucleus jars on classpath
ParallelCollectionRDD[0] at parallelize at ParallelCollection.scala:8
```