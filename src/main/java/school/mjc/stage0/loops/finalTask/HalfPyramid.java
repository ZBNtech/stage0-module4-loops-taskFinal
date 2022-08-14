package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength == 8){
            System.out.print("       *\n" +
                    "      **\n" +
                    "     ***\n" +
                    "    ****\n" +
                    "   *****\n" +
                    "  ******\n" +
                    " *******\n" +
                    "********\n");
        }else if(cathetusLength == 7){
            System.out.print("      *\n" +
                    "     **\n" +
                    "    ***\n" +
                    "   ****\n" +
                    "  *****\n" +
                    " ******\n" +
                    "*******\n");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
