package uk.ac.shu.webarch.eregister

/*
 * A Class. 
 * We called the class RegClass to avoid reserved word clashes with the java keyword "class"
 *
 * This class has a name, and a foreign key to the instructor who teaches this class. This is the 1 sideyyyy
 
class RegClass {

  String name


  Instructor classInstructor

  
  Course course

 
  Set enrolledSudents


  static hasMany = [
  ]

  static mappedBy = [
  ]

  static constraints = {
  }

  static mapping = {
    classInstructor column:'instructor_fk'
    course column:'course_fk'
  }
}

