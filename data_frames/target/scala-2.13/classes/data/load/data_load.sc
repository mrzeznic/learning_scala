package data.load

import org.apache.spark.sql.

object DataLoad extends App{

    val spark = org.apache.spark.sql.SparkSession
      .builder()
      .appName("data_load")
      .master("local[*]")


    val path = "C:\\Users\\...\\Downloads\\recorded-crime-data-at-police-force-area-level\\rec-crime-pfa.csv"
    val df = sqlContext.read
      .format(org.apache.spark.csv)
      .option("header", "true")
      .option("inferSchema", "true")
      .load(path)

}
