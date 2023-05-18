fun main(args: Array<String>) {
    //task 151
    val n = 125
    var sum = 0
    for (i in 1..n) {
        if (n % i == 0) {
            sum += i
        }
    }
    println(sum)
    sum = 0

    //task152
    var multiple = 1
    for (i in 1..n) {
        if (n % i == 0) {
            multiple *= i
        }
    }
    println(multiple)
    multiple = 1

    //task 153
    for (i in 1..n) {
        if (n % i == 2) {
            sum += i
        }
    }
    println(sum)
    sum = 0

    //task 154
    for (i in 1..n) {
        if (n % i == 3) {
            multiple *= i
        }
    }
    println(multiple)
    multiple = 1

    //task 155
    for (i in 10..99) {
        if (i % 3 == 0) {
            sum += i
        }
    }
    println(sum)
    sum = 0

    //task 156
    for (i in 10..99) {
        if (i % 3 == 0 && i % 5 == 0) {
            multiple *= i
        }
    }
    println(multiple)
    multiple = 1

    //task 157
    for (i in 100..999) {
        if (i % 5 != 0) {
            sum += i
        }
    }
    println(sum)
    sum = 0

    //task 158
    for (i in 10..99) {
        if (i % 2 != 0 && i % 3 != 0) {
            multiple *= i
        }
    }
    println(multiple)
    multiple = 1

    //task 159
    for (i in 10..99) {
        if (i % 3 == 1 && i % 4 == 2) {
            multiple *= i
        }
    }
    println(multiple)
    multiple = 1

    //task 160
    var smallestNumber = 9999
    for (num in 100..999) {
        val product = num * 16
        val squareRoot = Math.sqrt(product.toDouble())
        if (squareRoot % 1 == 0.0 && num < smallestNumber) {
            smallestNumber = num
        }
    }
    println(smallestNumber)

    //task 161
    smallestNumber = 9999
    for (num in 1000..9999) {
        val product = num * 26
        val squareRoot = Math.sqrt(product.toDouble())
        if (squareRoot % 1 == 0.0 && num < smallestNumber) {
            smallestNumber = num
        }
    }
    println(smallestNumber)

    //task 162
    var biggestNumber = 1000
    for (num in 1000..9999) {
        val product = num * 14
        val squareRoot = Math.sqrt(product.toDouble())
        if (squareRoot % 1 == 0.0 && num > biggestNumber) {
            biggestNumber = num
        }
    }
    println(biggestNumber)

    //task 163
    biggestNumber = 1000
    for (num in 1000..9999) {
        val product = num * 18
        val squareRoot = Math.sqrt(product.toDouble())
        if (squareRoot % 1 == 0.0 && num > biggestNumber) {
            biggestNumber = num
        }
    }
    println(biggestNumber)

    //task 164
    val numb = 12
    for (num in 100..999) {
        val squareRoot = Math.sqrt(num.toDouble())
        if (squareRoot > numb) {
            println(num)
            break
        }
    }

    //task 165
    val num = 10
    val t: (Int) -> Boolean = { number -> number % 3 == 0 }
    println("t = ${t(n)}")

    //task 166
    val number = 16
    var y = 0
    val isPowerOfFour = checkPowerOfFour(number)
    if (isPowerOfFour) {
        y = 1
        println("y = $y")
    } else {
        println("y = $y")
    }
    //task 167
    val x = 2.5
    var r = false
    for (n in 1..30) {
        val result = Math.sin(Math.pow(x, n.toDouble()))

        if (result < 0) {
            r = true
            break
        }
    }
    println("y = $r")

    //task 168
    val n1 = 13
    val p = isPrime(n1)
    if(p){
        println("p = $p")
    }
    else{
        println("p = $p")
    }

    //task 169
    val x1 = 7
    val y1 = 7
    val p1 = isPrime(x1+y1)
    if(p1){
        val z = 5
        println("z = $z")
    }
    else{
        val z = 6
        println("z = $z")
    }

    //task 170
    var numb1 = 513
    while (true) {
        val isPowerOfTwo = checkPowerOfTwo(numb1)
        if (isPowerOfTwo) {
            println(numb1)
            break
        }
        numb1++
    }

    //task 171
    val factor = 5
    var factorial = 1
    for (i in 1..factor) {
        factorial *= i
    }
    println("$factor! = $factorial")
}

fun checkPowerOfFour(number: Int): Boolean {
    var n = number
    while (n != 0 && n % 4 == 0) {
        n /= 4
    }
    return n == 1
}
fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }

    val sqrt = kotlin.math.sqrt(n.toDouble()).toInt()
    for (i in 2..sqrt) {
        if (n % i == 0) {
            return false
        }
    }

    return true
}
fun checkPowerOfTwo(number: Int): Boolean {
    var n = number
    while (n != 0 && n % 2 == 0) {
        n /= 2
    }
    return n == 1
}