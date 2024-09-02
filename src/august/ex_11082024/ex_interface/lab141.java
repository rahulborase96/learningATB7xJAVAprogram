package august.ex_11082024.ex_interface;

public class lab141 {
    public static void main(String[] args) {

    }
}
interface  I{}
class A{}
class B{}
abstract class C{}
class test1 extends A{}
class TEST2 extends B{}
//class Test3 extends A,B{} // no possible-Multiple Inheritance
class test4 implements I{}
interface I1{}
interface I2{}
class test5 implements I1,I2{} // multiple Inheritance with interface
class tset6 extends A implements I1,I2 {}
// class  test6 implements I1 extends A{}  //it's to be in sequence class-extends-implements
//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends I1,I2{}  //inter only extends another interface
//interface I7  extends C{}