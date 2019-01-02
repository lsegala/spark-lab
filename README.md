# Curso de introdução ao Spark

## Dockerfile

Primeiramente clone o projeto para uma pasta local

Aqui há duas opções:
* Realize o download dos arquivos que estão no arquivo Dockerfile para sua pasta
* Ou Descomente a linha onde há os comandos curl e comente a linha do comando COPY

Agora basta testar o funcionamento:
```
$ docker build -t spark-lab .
$ docker run -it spark-lab
/App# spark-shell
Spark assembly has been built with Hive, including Datanucleus jars on classpath
Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properties
18/12/28 00:40:19 INFO SecurityManager: Changing view acls to: root
18/12/28 00:40:19 INFO SecurityManager: Changing modify acls to: root
18/12/28 00:40:19 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users with view permissions: Set(root); users with modify permissions: Set(root)
18/12/28 00:40:19 INFO HttpServer: Starting HTTP Server
18/12/28 00:40:19 INFO Utils: Successfully started service 'HTTP class server' on port 42259.
Welcome to
      ____              __
     / __/__  ___ _____/ /__
    _\ \/ _ \/ _ `/ __/  '_/
   /___/ .__/\_,_/_/ /_/\_\   version 1.2.0
      /_/

Using Scala version 2.10.4 (OpenJDK 64-Bit Server VM, Java 1.7.0_181)
Type in expressions to have them evaluated.
Type :help for more information.
18/12/28 00:40:24 INFO SecurityManager: Changing view acls to: root
18/12/28 00:40:24 INFO SecurityManager: Changing modify acls to: root
18/12/28 00:40:24 INFO SecurityManager: SecurityManager: authentication disabled; ui acls disabled; users with view permissions: Set(root); users with modify permissions: Set(root)
18/12/28 00:40:25 INFO Slf4jLogger: Slf4jLogger started
18/12/28 00:40:25 INFO Remoting: Starting remoting
18/12/28 00:40:25 INFO Remoting: Remoting started; listening on addresses :[akka.tcp://sparkDriver@2176ad28210c:39359]
18/12/28 00:40:25 INFO Utils: Successfully started service 'sparkDriver' on port 39359.
18/12/28 00:40:25 INFO SparkEnv: Registering MapOutputTracker
18/12/28 00:40:25 INFO SparkEnv: Registering BlockManagerMaster
18/12/28 00:40:25 INFO DiskBlockManager: Created local directory at /tmp/spark-local-20181228004025-a910
18/12/28 00:40:25 INFO MemoryStore: MemoryStore started with capacity 265.4 MB
18/12/28 00:40:25 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
18/12/28 00:40:26 INFO HttpFileServer: HTTP File server directory is /tmp/spark-dd7af262-5560-4f0a-8247-46560cddc354
18/12/28 00:40:26 INFO HttpServer: Starting HTTP Server
18/12/28 00:40:26 INFO Utils: Successfully started service 'HTTP file server' on port 39425.
18/12/28 00:40:26 INFO Utils: Successfully started service 'SparkUI' on port 4040.
18/12/28 00:40:26 INFO SparkUI: Started SparkUI at http://2176ad28210c:4040
18/12/28 00:40:26 INFO Executor: Using REPL class URI: http://172.17.0.2:42259
18/12/28 00:40:26 INFO AkkaUtils: Connecting to HeartbeatReceiver: akka.tcp://sparkDriver@2176ad28210c:39359/user/HeartbeatReceiver
18/12/28 00:40:26 INFO NettyBlockTransferService: Server created on 46667
18/12/28 00:40:26 INFO BlockManagerMaster: Trying to register BlockManager
18/12/28 00:40:26 INFO BlockManagerMasterActor: Registering block manager localhost:46667 with 265.4 MB RAM, BlockManagerId(<driver>, localhost, 46667)
18/12/28 00:40:26 INFO BlockManagerMaster: Registered BlockManager
18/12/28 00:40:26 INFO SparkILoop: Created spark context..
Spark context available as sc.
```

# Primeiro script no shell

```
scala> val myFile = sc.textFile("spark-1.2.0-bin-hadoop2.4/README.md")
myFile: org.apache.spark.rdd.RDD[String] = README.md MappedRDD[1] at textFile at <console>:12
scala> myFile.count()
res0: Long = 98
```