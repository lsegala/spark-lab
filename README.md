# Curso de introdução ao Spark

## Dockerfile

Primeiramente clone o projeto para uma pasta local

Dentro do diretório onde foi clonado o projeto, faça o build da imagem:

```
$ docker build -t spark-lab .
```

Após um tempo construindo, é importante ressaltar o passo 10:

```
Step 10/10 : RUN spark-submit  --class SimpleApp --master local /App/example-1/target/scala-2.10/simple-project_2.10-1.0.jar
 ---> Running in 74c47ae0b4c3
tput: No value for $TERM and no -T specified
Spark assembly has been built with Hive, including Datanucleus jars on classpath
There are 17 lines that contain the word Copyright
```

Se no final mostrar que há 17 linhas contendo a palavra Copyright é porque funcionou!