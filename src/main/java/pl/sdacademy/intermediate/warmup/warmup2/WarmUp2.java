package pl.sdacademy.intermediate.warmup.warmup2;

public class WarmUp2 {

    public static void main(String[] args) {


        String[] array = new String[] { "abc", "cde", "efghijk", "lmnopr", "st", "u", "vwxyz" };


        int sum=0;

        for (String e:array ) {
            sum+=e.length();
        }
        System.out.println(sum);


    }
}
