package com.tree1123


/**
 * @author tree
 * @date 2020/4/21
 *
 *      Scala学习系列（三）——入门与基础
 */
object Base {

  def main(args: Array[String]): Unit = {

    //声明值和变量
    //使用val定义的变量值是不可变的，相当于java里用final修饰的变量
    val aaa: Int = 4 * 2

    //aaa = 10
    //使用var定义的变量是可变的，在Scala中鼓励使用val
    //变量名在前，类型在后
    var bbb: Int = 4 * 2
    bbb = 10

    //类型
    val ccc: String = 1.toString

    //算术与运算符
    var a = 10;
    var b = 20;
    var c = 25;
    var d = 25;
    println("a + b = " + (a + b) );
    println("a - b = " + (a - b) );
    println("a * b = " + (a * b) );
    println("b / a = " + (b / a) );
    println("b % a = " + (b % a) );
    println("c % a = " + (c % a) );

    println("a == b = " + (a == b) );
    println("a != b = " + (a != b) );
    println("a > b = " + (a > b) );
    println("a < b = " + (a < b) );
    println("b >= a = " + (b >= a) );
    println("b <= a = " + (b <= a) );

    var e = true;
    var f = false;

    println("e && f = " + (e&&f) );

    println("e || f = " + (e||f) );

    println("!(e && f) = " + !(e && f) );

    c = a + b;
    println("c = a + b  = " + c );

    c += a ;
    println("c += a  = " + c );

    c -= a ;
    println("c -= a = " + c );

    c *= a ;
    println("c *= a = " + c );

    a = 10;
    c = 15;
    c /= a ;
    println("c /= a  = " + c );

    a = 10;
    c = 15;
    c %= a ;
    println("c %= a  = " + c );

    c <<= 2 ;
    println("c <<= 2  = " + c );

    c >>= 2 ;
    println("c >>= 2  = " + c );

    c >>= a ;
    println("c >>= a  = " + c );

    c &= a ;
    println("c &= 2  = " + c );

    c ^= a ;
    println("c ^= a  = " + c );

    c |= a ;
    println("c |= a  = " + c );

    //注意
    1 + 2
    1.+(2)

    //几个特性
    import scala.math._
    var math = sqrt(2)

    BigInt.probablePrime(100,scala.util.Random)

    "Hello".distinct


    //apply  update
    "Hello"(4)
    "Hello".apply(4)
     Array(1,2,3)
    Array.apply(1,2,3)

    var arr = Array(1,2,3)
    arr(2)=5
    arr.update(2,5)


  }

}
