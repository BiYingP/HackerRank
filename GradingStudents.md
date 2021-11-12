Grading students

HackerLand University has the following grading policy:

Every student receives a grade in the inclusive range from 0 to 100.
Any grade less than 40 is a failing grade.

- If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the nexe multiple of 5.

- If the value of grade is less than 38, no rounding occurs as the result will still be a failling grade.

Examples

- grade = 84 round to 85 (85-84 is less than 3)
- grade = 29 do not round (result is less than 40)
- grade = 57 do not round (60-57 is 3 or higher)



    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> res = new ArrayList();
    for (int grade : grades){
          if (grade < 38 || grade % 5 < 3){
              res.add(grade);
          }
          else{
            res.add(grade + (5 - (grade % 5)));
          }
            
    }
    return res;  
    
    }

  
