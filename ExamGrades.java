// -> double
// Returns the highest grade in this ExamGrades



class ExamGrades {
  double grades[];
  
  ExamGrades(double grades[]) {
    this.grades = grades;
  }
  
  // TODO design a function that returns the highest grade
 
  // TEMPLATE
  /* Fields:
   *   ...this.grades...
   */
  double highestGrade() {  
    double highestGrade = 0.0;
    
    for(int i = 0; i < this.grades.length; i++) {
      if(highestGrade < grades[i]) {
        highestGrade = grades[i];
      }
    }
    return highestGrade;
  }

}