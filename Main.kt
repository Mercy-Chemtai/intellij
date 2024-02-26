  fun main() {
      greetingsname ("Hello Mercy")
      var x = modulus(40,15.0)
      var y = add(20,30,40,50)
      fact ("I love outdoor activities")




  }
  fun greetingsname(name: String){
      println(name)
  }

      fun modulus(num1:Int ,num2:Double):Double{
          var reminder = num1%num2
          println(reminder)
          return num1 % num2
      }
  fun add(num1:Int,num2:Int,num3:Int,num4:Int):Int{
      var result =num1+num2+num3+num4
      println(result)
      return result
  }
  fun fact(intrestingthingaboutme:String){
      var fact= "I love outdoor activities"
      println(fact)

  }



