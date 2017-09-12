class Book {
  Author author;
  String title;
  int year;  // published
  
  Book(Author author, String title, int year) {
    this.author = author;
    this.title = title;
    this.year = year;
  }
  
  // TEMPLATE
  /*   Fields:
   *     this.author   -- Author
   *     this.title    -- String
   * 
   *   Methods:
   * 
   *   Methods of author:
   *     this.author.equals()  -- boolean
   */
  
  // Book -> boolean
  // Returns true if this Book has the same author
  // as another book
  boolean sameAuthor(Book that) {    
    return this.author.equals(that.author);
    
    // TEMPLATE
    /*    this.author
     *    this.title
     * 
     *    that
     *    that.author
     *    that.title
     */
  }
  //Book -> Boolean
  // Returns true if this Book is published before the given Book
  //TEMPLATE
    /*    this.author
     *    this.title
     *    this.year
     * 
     *    that
     *    that.author
     *    that.title
     *    that.year
     */
  boolean isPubBefore(Book that){
    return this.year < that.year;
  }
 
  
  // TODO design a function publishedBefore that accepts a Book and
  //   returns true if this Book was published before the other 
  
  
}