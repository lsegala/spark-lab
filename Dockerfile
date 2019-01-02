FROM openjdk:7
WORKDIR /App
#RUN curl https://archive.apache.org/dist/spark/spark-1.2.0/spark-1.2.0-bin-hadoop2.4.tgz --output spark-1.2.0-bin-hadoop2.4.tgz --silent
#RUN curl https://scala-lang.org/files/archive/scala-2.10.4.tgz?_ga=2.15883763.437791435.1545956260-536811945.1545942107 --output scala-2.10.4.tgz --silent
#No meu caso, preferi realizar o download pro meu computador e depois copiar para a imagem
COPY *.tgz /App/
RUN tar xvzf scala-2.10.4.tgz &&\
	tar xvzf spark-1.2.0-bin-hadoop2.4.tgz
COPY log4j.properties /App/spark-1.2.0-bin-hadoop2.4/conf
ENV SCALA_HOME /App/scala-2.10.4
ENV SPARK_HOME /App/spark-1.2.0-bin-hadoop2.4
ENV PATH $PATH:$SCALA_HOME/bin:$SPARK_HOME/bin