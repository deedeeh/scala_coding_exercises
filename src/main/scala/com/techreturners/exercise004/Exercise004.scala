package com.techreturners.exercise004

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalDateTime}

class Exercise004(var dateTime: LocalDateTime) {

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight

  def this(localDate: LocalDate) = {
    this(localDate.atStartOfDay())
  }

  def getDateTimeWithGigaSecond: LocalDateTime = {
    val year = dateTime.getYear
    val month = String.format("%02d", dateTime.getMonthValue)
    val day = String.format("%02d", dateTime.getDayOfMonth)
    val hour = String.format("%02d", dateTime.getHour)
    val minute = String.format("%02d", dateTime.getMinute)
    val second = String.format("%02d", dateTime.getSecond)
    val nanoOfSecond = dateTime.getNano
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")
    val dateTimeBeforeGigaSecond = LocalDateTime.parse(s"${year}-${month}-${day} ${hour}:${minute}:${second}.${nanoOfSecond}", formatter)
    dateTimeBeforeGigaSecond.plusSeconds(1000000000)
  }
}
