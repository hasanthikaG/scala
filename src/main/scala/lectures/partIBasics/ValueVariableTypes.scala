package lectures.partIBasics

object ValueVariableTypes extends App {
 // Values

 val x = 42;
 println(x);
 val astring: String = "hello";
 println(astring)

 val aBoolean: Boolean = true
 println(aBoolean);

 val aChar: Char = 'a';
 val aShort: Short = 4566;
 val aLong: Long = 223232322222L;
 val aFloat: Float = 2.0f;
 val aDouble: Double = 3.14;

 // VALS ARE IMMUTABLE
 // COMPILER can infer types


 //Variables
 var aVariable:Int = 4;
 aVariable = 10; // side effects

 // all vals and vars have types
 // compiler automatically infers types when omitted
 // prefer vals over vars
}
