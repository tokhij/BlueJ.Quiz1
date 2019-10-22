 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int startFact = 1;
          for (int i = 2; i <= number; i++){
              startFact = startFact * (i);}
              return startFact;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String result = "";
          String[] randomWords = phrase.split(" ");
          for (int i = 0; i < randomWords.length; i++){
              result += Character.toString(randomWords[i].charAt(0)).toUpperCase();
            }
          
          return result;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          char[] randomChar = word.toCharArray();
          for (int i = 0; i < randomChar.length; i++){
         
            if (randomChar[i] == 'x'){
                randomChar[i] = 'a';
            }
            else if (randomChar[i] == 'y'){
                randomChar[i] = 'b';
            }
            else if (randomChar[i] == 'z'){
                randomChar[i] = 'c';
            }
            else {
            randomChar[i] += 3;
        }
        }
          String randomString = new String(randomChar);
          
          return randomString;
        }
      
}
