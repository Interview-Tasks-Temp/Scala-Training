package lectures.part1basics

object Expressions extends App {

  var x: Int = 1 + 2;
  println(x);

  // instructions
  x = 5;
  println(x)

  // expression
  val aCondition: Boolean = true;
  println(if(aCondition) 5 else 3);

  var i: Int = 0;
  while (i < 10) {
    println(i);
    i += 1;
  }

  val aWeirdValue = (x = 3); // Unit == void

  // side effects: println(), whiles, reassigning

  // code blocks
  val aCodeBlock = {
    val y = 2;
    val z = y + 1;
    if (z > 2) "hello" else "goodbye";
  }



}
