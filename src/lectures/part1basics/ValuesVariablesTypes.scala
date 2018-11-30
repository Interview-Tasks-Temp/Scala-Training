package lectures.part1basics

object ValuesVariablesTypes extends App {

  // immutable
  val x: Int = 42;
  println(x);

  // type inference
  val y = 43;
  println(y);

  val aString: String = "hello";
  val anotherString = "goodbye";

  val aBoolean: Boolean = false;
  val anotherBoolean = true;

  val aChar: Char = 'a';

  val aFloat: Float = 2.0f;
  val aDouble: Double = 3.14d;


  var aVariable: Int = 4;
  aVariable = 5;

}
