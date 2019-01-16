import org.apache.spark.{SparkConf,SparkContext}

object ParallelCollection {
  def main(args: Array[String]): Unit = {
    val spConf = new SparkConf().setAppName("Simple Project")
    val sc = new SparkContext(spConf)
    val arrayData = Array(2,4,6,8,10)
    val parallelData = sc.parallelize(arrayData)
    println(parallelData)
  }
}