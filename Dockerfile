FROM leonardosegala/spark-scala
COPY example-1 /App/example-1
RUN cd /App/example-1 && sbt package

ENV MAIN_CLASS SimpleApp

CMD spark-submit  --class $MAIN_CLASS --master local /App/example-1/target/scala-2.10/simple-project_2.10-1.0.jar