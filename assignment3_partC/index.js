function Student(id, firstName, lastName) {
  this.id = id
  this.firstName = firstName
  this.lastName = lastName
}

function System(students) {
  this.students = students
}

System.prototype.add = function(student) {
  this.students.push(student)
}

System.prototype.search = function(firstName, lastName) {
  const student = this.students.find((student) => {
    return student.firstName === firstName && student.lastName === lastName
  })
  if (student != null) {
    return student
  }
  return "Student not found"
}

System.prototype.count = function() {
  return this.students.length
}

module.exports = { Student, System }
