import scala.Console.println
import scala.io.StdIn

object PalindromicString extends App {

  try {
    println("Please input a string to check for panidrome: ")
    // Read input from the user
    val user_Input = StdIn.readLine()

   
    def checkPalindrome(wordToCheckForPalindrome: String): Boolean = //method to check if string is palindrome
    {
      if (wordToCheckForPalindrome.isEmpty()) 
      {
        throw new IllegalArgumentException("Empty string is not allowed.")
      }
      if (wordToCheckForPalindrome.matches("[0-9]+")) 
      {
        throw new IllegalArgumentException("Only string allowed")
      }
      for (indexOfString <- 0 until wordToCheckForPalindrome.length / 2) 
      {
        if (wordToCheckForPalindrome(indexOfString) != wordToCheckForPalindrome(wordToCheckForPalindrome.length - indexOfString - 1)) 
        {
          return false
        }
      }
      true
    }

    println(if (checkPalindrome(user_Input)) "YES" else "NO")
    
    
  } catch //for exception handling
   {
      
    case notStringOrEmptyString: IllegalArgumentException => println(s"Error: ${notStringOrEmptyString.getMessage}") 

    
    case defaultError: Exception => println(s"An error occurred: ${defaultError.getMessage}")    //any other error
  }
}
