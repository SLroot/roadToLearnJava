# Student Grade Manager

A small console application in Java for managing student grades. It was written as a practice project to apply loops, conditionals, arrays and `ArrayList` in one program.

## Features

- **Add a student** with a name and a grade (the grade must be between 0 and 20)
- **List all students** with their grades
- **Show statistics:** highest grade, lowest grade (with the student's name) and the average
- **Search by name** to look up a student's grade
- **Remove a student** by name
- **Menu-driven interface** that runs until the user chooses to exit

## Example

```
----------
1) Add student
2) List students
3) Show statistics
4) Search by name
5) Remove student
0) Exit
----------
```

```
enter name: Sara
enter grade (0-20): 17
```

```
max grade: Sara - 17.0
min grade: Ali - 15.0
The average is: 16.0
```

## How to run

Requires Java 8 or newer.

```bash
javac Main.java
java Main
```

## Concepts practiced

- `while` loop for the main menu, `for` loops for traversing the data
- `if / else if / else` for menu choices and input validation
- Two parallel `ArrayList`s (`names` and `grades`) kept in sync
- `indexOf`, `remove(int index)`, `isEmpty()`
- Splitting a program into small `static` methods
- Reading input with `Scanner`

## Possible improvements

- Reject duplicate student names
- Sort students by grade (for example with bubble sort)
- Print a grade distribution histogram using an `int[]` array
- Handle non-numeric input with `try/catch`
- Replace the two parallel lists with a `Student` class

## License

Free to use for learning purposes.
