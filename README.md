Lab 4 - Changes to libraryService from working with a single supplied Book to owning a list<Book>. 
List<Book> tells the complier that the variable is a list that accepts Book references.
Final does nothing here because, it protects the collection from a null book and then appends the book reference to the Arraylist.
findBookByTitle returns the title for a known one and for an unknown one it skips that line, in the console nothing shows.
removeBook reuses findBookByTitle instead of another loop because if the loop finishes with a match the returns are null.