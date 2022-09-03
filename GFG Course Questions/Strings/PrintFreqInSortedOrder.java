//Question : Print frequencies of characters(in sorted order) in a string of lower case of alphabets

//Time Complexity : O(N); Auxiliary Space : O(N)
class PrintFreqInSortedOrder {

    public static void main(String[] args) {
        String input = "meghaverma";
        System.out.println("For given string frequency is :");
        printFreq(input);

    }

  /*
  - Declare count array of total number of letter in lower case alphabets
  - find the index of each character by ASCII/UTF-16 value with formula = str.charAt(i) - 'a' and increment the value present at index
  - print the array
  */
    static void printFreq(String input) {
        int[] count = new count[26];

        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i) - 'a']++;
        }
      
        //This is constant work - not contributes to time complexity analysis
        for (int i = 0; i < 26; i++) {
            System.out.println(char(i + 'a') + " " + count[i]);
        }
    }
}


/*
OUTPUT:
For given string frequency is :
a 2
e 2
g 1
h 1
m 2
r 1
v 1
*/
