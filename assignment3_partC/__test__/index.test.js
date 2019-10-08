const { Student, System } = require("../index")

let system, student
beforeEach(() => {
  student = new Student(0, "John", "Wilson")
  system = new System([student])
})

test("search student", () => {
  expect(system.search("John", "Wilson")).toBe(student)
})

test("search student not found", () => {
  expect(system.search("Random", "Wilson")).toBe("Student not found")
})

test("Add new student", () => {
  const newStudent = new Student(1, "Jack", "Smith")
  system.add(newStudent)
  expect(system.students).toContain(newStudent)
})

test("count students", () => {
  expect(system.count()).toBe(1)
})
