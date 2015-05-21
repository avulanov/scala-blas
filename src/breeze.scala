val range = Seq(1, 10, 100, 1000, 10000)
// Float
for (i <- range) { for(j <- range) { if (j > i) {} else { val a = breeze.linalg.DenseMatrix.rand[Double](i, i).mapValues(_.toFloat); val b = breeze.linalg.DenseMatrix.rand[Double](i, j).mapValues(_.toFloat); System.gc(); val t = System.nanoTime(); val c = a * b; println(c(0,0) + " " + i + "x" + i + "*" + i + "x" + j + "\t" + (System.nanoTime() - t) / 1e9)}}}
// Double
for (i <- range) { for(j <- range) { if (j > i) {} else { val a = breeze.linalg.DenseMatrix.rand[Double](i, i); val b = breeze.linalg.DenseMatrix.rand[Double](i, j); System.gc(); val t = System.nanoTime(); val c = a * b; println(i + "x" + i + "*" + i + "x" + j + "\t" + (System.nanoTime() - t) / 1e9)}}}
