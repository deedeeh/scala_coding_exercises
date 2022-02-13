package com.techreturners.exercise002

class Exercise002 {
  def isFromManchester(person: Person): Boolean =
      person.city ==  "Manchester"


    def canWatchFilm(person: Person, ageLimit: Int): Boolean =
      person.age >= ageLimit

}


