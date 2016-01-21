// With some step, square matrices and multiple runs
val minDim = 1000
val maxDim = 46000
val step = 1000
val repetitions = 10
val range = for (b <- minDim to maxDim by step) yield b
//val range = for (b  <- 6 to 14) yield { math.pow(2, b).toInt}
for (i <- 0 until range.length) {
  var result = new Array[Double](repetitions)
  val dim = range(i) 
  for (j <- 0 until repetitions) {
    val a = breeze.linalg.DenseMatrix.rand[Double](dim, dim).mapValues(_.toFloat); 
    val b = breeze.linalg.DenseMatrix.rand[Double](dim, dim).mapValues(_.toFloat); 
    System.gc(); 
    val t = System.nanoTime(); 
    val c = a * b; 
    val totalTime = System.nanoTime() - t; 
    result(j) = totalTime; 
  }
  val someValue = result.last
  scala.util.Sorting.quickSort(result)
  val median = (result(repetitions / 2) + result(repetitions / 2 - 1)) / 2
  val avg = result.sum / result.length
  val gigaFlops = 2.0 / median * dim * dim * dim
  println(dim + "\t" + median / 1e9 + "\t" + avg / 1e9 + "\t" + someValue / 1e9 + "\t" + gigaFlops)
}
