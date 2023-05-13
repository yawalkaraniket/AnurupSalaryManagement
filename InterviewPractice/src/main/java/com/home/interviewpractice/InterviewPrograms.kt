package com.home.interviewpractice

/**
 * How to reverse a String in Java?
 */
fun reverseWithDefinedMethod(str: String): String {
    return str.reversed()
}

/**
 * How to reverse a String using for loop?
 */
fun reverseWithLogic(str: String): String {
    var s = ""
    for (a in str.length - 1 downTo 0) {
        s += str[a]
    }
    return s
}

/**
 * How to reverse a String using for each loop?
 */
fun reverseInSingleLine(str: String): String {
    val chars = CharArray(str.length)
    chars.indices.forEach { chars[str.length - it - 1] = str[it] }
    return String(chars)
}

/**
 * How to check palindrome number?
 */
fun checkPalindrome(str: String): Boolean {
    return str == reverseWithLogic(str)
}

/**
 * How to remove given string from string?
 */
fun removeStringFromString(mainString: String, stringToRemove: String): String {
    return mainString.replace(stringToRemove, "")

}

/**
 * How to remove given string from string?
 */
fun removeCharactersFromString(mainString: String?, stingToRemove: String): String {
    var removedString = ""
    mainString?.toCharArray()?.forEach { char ->
        if ((stingToRemove == char.toString()).not()) {
            removedString += char.toString()
        }
    }
    return removedString
}

fun removeCharactersFromStringFromPredefined(mainString: String, stringToRemove: String): String {
    return mainString.filter { (it.toString() == stringToRemove).not() }
}

fun printAllPermutationOfString(string: String) {
    printPermutation(string, "")
}

/*
    * Function to print all the permutations of str
*/
fun printPermutation(str: String, ans: String) {

    // If string is empty
    if (str.isEmpty()) {
        print("$ans ")
        return
    }
    for (i in str.indices) {

        // Rest of the string after excluding the ith character.
        val ros = str.substring(0, i) + str.substring(i + 1)

        // Recursive call
        printPermutation(ros, str[i].toString())
    }
}




