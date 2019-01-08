import org.apache.spark.{SparkConf,SparkContext}

object SimpleApp {
  def main(args: Array[String]): Unit = {
    val targetFile = "spark-1.2.0-bin-hadoop2.4/LICENSE"
    val spConf = new SparkConf().setAppName("Simple Project")
    val spCtx = new SparkContext(spConf)
    val myTextFile = spCtx.textFile(targetFile, 2).cache()
    val linesWithCopyright = myTextFile.filter(line => line.contains("Copyright")).count()
    println("There are %s lines that contain the word Copyright".format(linesWithCopyright))
  }
}
