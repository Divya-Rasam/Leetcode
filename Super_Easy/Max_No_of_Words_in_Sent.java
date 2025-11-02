package Super_Easy;

public class Max_No_of_Words_in_Sent {

    public static void main(String[] args) {
        

    String [] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

    // Output: 6

    // we need to go through all strings
        // each string count words in it and save somewhere
            // whichever no max is that in output


    int max = 0;

    for ( int i = 0; i < sentences.length; i++) {
        String [] words = sentences[i].split(" ");
        int count = words.length;
        if (count>max) {
            max = count;
        }
    }

    System.out.println(max);
























    // int max = 0;

    // for (int i = 0; i < sentences.length; i++) {
    //     String [] words = sentences[i].split(" ");
    //     int count = words.length;

    //     if (count > max) {
    //         max = count;
    //     }

    // }

    // System.out.println(max);


    }

}
