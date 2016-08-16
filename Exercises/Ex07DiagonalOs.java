/**
 * Created by kurt on 16/08/2016.
 */
public class Ex07DiagonalOs {
    public static void main(String[] args) {
        Ex07DiagonalOs test = new Ex07DiagonalOs();
        test.makeOs();
    }

    private void makeOs()
    {
        int i;
        String preString = "";
        for (i = 0; i < 11; i++) {
            System.out.println(preString + "O");
            preString += " ";
        }

    }

}
