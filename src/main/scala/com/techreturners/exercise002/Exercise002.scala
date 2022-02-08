package com.techreturners.exercise002

class Exercise002 {
  def isFromManchester(person: Person): Boolean = {
      if(person.city ==  "Manchester") {
        return true
      }
      false
    }

    def canWatchFilm(person: Person, ageLimit: Int): Boolean = {
      if(person.age >= ageLimit) true else false
    }

}


