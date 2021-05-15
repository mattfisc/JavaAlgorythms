public class main {
    public static String rangeExtraction(int[] arr) {

        String answer = "";

        boolean sequence = false;
        for(int i = 0; i < arr.length-1; i++){

            // sequence
            if(arr[i]+1 == arr[i+1]){
                if(sequence == false)
                    answer = answer + arr[i] + "-";
                sequence = true;
            }

            else
                sequence = false;

            if(!sequence)
                answer = answer + arr[i];



            if(i != arr.length-1 && sequence == false)
                answer = answer + ",";
            if(i == arr.length-2)
                answer = answer + arr[arr.length-1];

        }

        return answer;
    }


    public static void main(String[] args) {
        int[] arr = new int[] {-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        String answer = rangeExtraction(arr);

        System.out.println(answer);
    }

}
