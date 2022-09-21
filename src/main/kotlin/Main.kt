fun main(args: Array<String>) {

    val c = mutableListOf(67, 45, 3, 50) // 0, 1 , 2, 3

    val d = mutableListOf(1, 2, 3, 4)

//    println(c.size)

    c.forEachIndexed { index, number ->
        d.add(index+1)
    }


    d.forEach {
        println(it)
    }






}




