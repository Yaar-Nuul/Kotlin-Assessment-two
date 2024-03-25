//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println(arrayOfIntegers(nums = arrayOf(23, 14, 12, 22, 60, 54)))

    sphereVolume(3.14159)

    println(isPalindrome("madam"))

    giveString("Barnie bakes brown bagels and buns")


}
fun giveString(statement: String){
println(statement.toList())

}
fun arrayOfIntegers(nums: Array<Int>): Int {
    var summation = nums.sum()
    return summation

    return nums.count()

    var a =  nums.average()



}
fun sphereVolume (r: Double){
    var V = arrayOf(4/3 * 3.142 * r*r*r)
    println(V.contentToString())

}

fun isPalindrome(word: String): Boolean{
    if (word.reversed() == word ){
        return true}
    else{
        return false
    }
}
