class Main {
  public static void main(String[] args) {

    char[] alphabet = {'z','y','x','w','v','u','t','s','r','q','p','o','n','m','l','k','j','i','h','g','f','e','d','c','b','a'};

    // 1. Create a for-each loop that prints the array above with a space between the letters.
    for(int i = 0; i < alphabet.length; i++)
      {
        System.out.print(alphabet[i] + " ");
      }

    
    // This adds an extra space between the for-each loop you created above and the next loop.
    System.out.println();
  
    // 2. Create a loop which orders the alphabet correctly. Make sure that this actually changes the order of the array and not just printing out the reverse order. This is called changing the array in place.
    for(int i = 0; i < (alphabet.length/2); i++)
      {
         char myTempChar;
         int arrayLength = alphabet.length;
        
         myTempChar = alphabet[i];
         alphabet[i] = alphabet[arrayLength - 1 - i];
         alphabet[arrayLength - 1 - i] = myTempChar;
      }

    // 3. Create a for-each loop that prints out the letters with a space between them. 
    for(int i = 0; i < alphabet.length; i++)
      {
        System.out.print(alphabet[i] + " ");
      }

  }
}