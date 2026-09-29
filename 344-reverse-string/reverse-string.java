class Solution {
    // h e l l o
    // i       j -> switch char
    // o       h
    //move index 

    // h e l l o
    //   i   j 

    // h e  l  l o
    //     ij     -> here condition will fail char will remain the same position
    public void reverseString(char[] s) {

        int i = 0, j = s.length-1;

        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i +=1;
            j -=1;
        }
    }
}