
## Practice Exceptions:

- Create a java file PracticeExceptions.java and save it in the folder we created yesterday ```.../APCSA_1/apcsa-assignments-YourUsername/classwork/16_exceptions/```. Implement the following methods inside that class:
  
- A method that takes an integer as a parameter and throws an exception if the number is odd.
  
- A method that takes an array of integers as a parameter and throws and exception if there is any negative number.

- A method that takes a String parameter and prints its length. If the parameter is null, catch the NullPointerException and print a message instead.

- A method that takes a string as input and throws an exception if the string does not contain vowels. Take a look at the String documentation, look for method ```contains```, it could be useful for this exercise.

- Write the ansvwer for the next two questions in a txt, md or any text file (answers.txt).
  
- What is wrong with the following code? Why it is showing compilation error?
  
  
```
public class JavaExceptionHandlingQuiz 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Try Block");
        }
         
        System.out.println("-----");
         
        catch (Exception e) 
        {
            System.out.println("Catch Block");
        }
    }
}
```
- What will be the output of the following program?

```
public class JavaExceptionHandlingQuiz 
{
    public static void main(String[] args) 
    {
        int i = 1;
         
        try
        {
            i++;
        }
        catch (Exception e) 
        {
            i++;
        }
        finally
        {
            i++;
        }
         
        System.out.println(i);
    }
}
```

