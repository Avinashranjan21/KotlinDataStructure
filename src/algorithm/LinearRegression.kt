package algorithm

/** Question 1
 * Q1: A string is given and you have to find all the words
 * (substrings separated by a space) which are
 * greater than given length k
 *  Expected: Input : str = "hello geeks for geeks is computer science portal"
        k = 4
        Output : hello geeks geeks computer science portal
        Explanation : The output is list of all words that are of length more than k.
        Input : str = "string is fun in python"
        k = 3
        Output : string python
 *
 * */

fun main(args: Array<String>) {

    var sentence = "hello geeks for geeks is computer science portal"
    var k = 4
    var resultArray = sentence.split(" ")
    for (item : String in resultArray){
        if (item.length >= k){
            print(" $item")
        }
    }





}