class ABC(val a: Int) {
  //  val a = 10
  val x = a

  def hello() = {
    "hello"
  }
}

val abc = new ABC(11)
abc.x
abc.a

class Person(val fname:String, val lname:String) {
  def full_name() = {
    fname + " " + lname
  }

  def apply(age: Int): Unit = {
    println(full_name() + " is of age " + age)
  }
}

val p1 = new Person("John","Doe")
p1.apply(30)
