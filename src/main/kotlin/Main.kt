fun main(args: Array<String>) {


    // 3 cars
    Car().drive()
    Car().stop()
    Car().drive()




    // one car
    val bmw = Car()

    bmw.drive()
    bmw.stop()
    bmw.drive()


    println()
}


class Car(){

    var isDriving = false


    fun drive(){

        isDriving = true
        println(isDriving)
    }


    fun stop(){

        isDriving = false
        println(isDriving)
    }

}



