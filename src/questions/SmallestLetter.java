package questions;
//leet-code 744

public class SmallestLetter {
    public static void main(String[] args) {
       char[] letters = {'c','f','j'};
       char target ='f';
        System.out.println(nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
         if(target<letters[mid]){
            end=mid-1;
        }else
            start=mid+1;
        }

       if(start==letters.length){
           return letters[0];
       }
       return letters[end+1];
    }
}