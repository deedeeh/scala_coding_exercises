package com.techreturners.exercise001

class Exercise001 {

  // Scala methods defined in various styles
  // Notice how the IDE identifies the return type even if
  // we don't specify it in the code
  // https://docs.scala-lang.org/tour/basics.html

  def capitalizeWord(word: String): String =
    word.substring(0, 1).toUpperCase + word.substring(1)

  def generateInitials(firstName: String, lastName: String) =
    s"${firstName.substring(0, 1)}.${lastName.substring(0, 1)}"

  def addVat(initialPrice: Double, interestRate: Double): Double = {
    val vatPrice = initialPrice * (interestRate / 100)
    (math rint (initialPrice + vatPrice) * 100) / 100
  }

  def reverse(sentence: String): String = sentence.reverse

  /**
   * Here we show using a Scala sequence which is a type of collection
   * https://alvinalexander.com/scala/seq-class-methods-examples-syntax/
   *
   * @param users A collection of users
   * @return
   */
  def countLinuxUsers(users: Seq[User]): Int = {
    var countUsers: Int = 0
    if (users.nonEmpty) {
      users.foreach { user =>
        user.productElementNames.toList
        if (user.osType == "Linux") {
          countUsers += 1
        }
      }
    }
    countUsers
  }
}





