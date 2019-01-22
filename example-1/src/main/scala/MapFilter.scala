import org.apache.spark.{SparkConf,SparkContext}
import org.apache.spark.SparkContext._

object MapFilter {
  def main(args: Array[String]): Unit = {
    val targetFile = "spark-1.2.0-bin-hadoop2.4/LICENSE"
    val spConf = new SparkConf().setAppName("Simple Project")
    val spCtx = new SparkContext(spConf)
    val myTextFile = spCtx.textFile(targetFile, 2).cache()
    println("Length of first non blank line %s".format(myTextFile
      .filter(p => p.length > 0)
      .map(m => m.length)
      .first))
    println("First line with Copyright %s".format(myTextFile
      .filter(line => line.contains("Copyright"))
      .first))
    println("Length of first line with Copyright %s".format(myTextFile
      .filter(line => line.contains("Copyright"))
      .map(m => m.length)
      .first))
    println("Normal first line %s".format(myTextFile.filter(p => p.length > 0).first))
    println("Reversed first line %s".format(myTextFile.filter(p => p.length > 0).map(m => m.reverse).first))
  }
}
