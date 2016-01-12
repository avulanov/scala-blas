val range = Seq(1, 10, 100, 1000, 10000)

// float in GPU
for (i <- range) { for(j <- range) { if (j > i) {} else { val a = grand(i, i); val b = grand(i, j); System.gc(); val t = System.nanoTime(); val c = a * b; println(i + "x" + i + "*" + i + "x" + j + "\t" + (System.nanoTime() - t) / 1e9)}}}

// float back and forth
for (i <- range) { for(j <- range) { if (j > i) {} else { val a = rand(i, i); val b = rand(i, j); System.gc(); val t = System.nanoTime(); val ga = gzeros(i, i); val gb = gzeros(i, j); ga.copyFrom(a); gb.copyFrom(b); val gres = ga * gb; val c = zeros(i, j); gres.toFMat(c); println(i + "x" + i + "*" + i + "x" + j + "\t" + (System.nanoTime() - t) / 1e9)}}}

// float CPU
for (i <- range) { for(j <- range) { if (j > i) {} else { val a = rand(i, i); val b = rand(i, j); System.gc(); val t = System.nanoTime(); val c = a * b;println(i + "x" + i + "*" + i + "x" + j + "\t" + (System.nanoTime() - t) / 1e9)}}}

// double CPU
for (i <- range) { for(j <- range) { if (j > i) {} else { val a = drand(i, i); val b = drand(i, j); System.gc(); val t = System.nanoTime(); val c = a * b;println(i + "x" + i + "*" + i + "x" + j + "\t" + (System.nanoTime() - t) / 1e9)}}}


// With power 2 step and square matrices
val range = for (b  <- 0 to 12) yield { math.pow(2, b).toInt}

// float in GPU
for (i <- range) { val a = grand(i, i); val b = grand(i, i); System.gc(); val t = System.nanoTime(); val c = a * b; val totalTime = System.nanoTime() - t; println(i + "x" + i + "*" + i + "x" + i + "\t" + totalTime / 1e9)}
