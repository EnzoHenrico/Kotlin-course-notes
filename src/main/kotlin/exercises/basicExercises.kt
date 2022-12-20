fun main() {

    val numOfYears: Int = 2
    val num: Int = 3
    val miles: Int = 210

    val str: String = "Dummy String for tests"
    println("#### 1 ####\n${calcDates(numOfYears)}\n###########")
    println("#### 2 ####\n${countChar(str)}\n###########")
    println("#### 3 ####\n${getCube(num)}\n###########")
    println("#### 4 ####\n${convertToKm(miles)}\n###########")
}

// 1
fun calcDates(year: Int) = "$year anos equivalem a: \n" +
            "${year * 12} meses \n" +
            "${year * 365} dias \n" +
            "${(year * 365) * 24} horas \n" +
            "${((year * 365) * 24) * 60} minutos \n" +
            "${(((year * 365) * 24) * 60) * 60} segundos \n"
// 2
fun countChar(str: String) = str.length + 1

//3
fun getCube(num: Int) = (num * num) * num

//4
fun convertToKm(miles: Int) = miles * 1.6