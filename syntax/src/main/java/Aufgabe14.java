public class Aufgabe14 {
    public static void main(String[] args) {

        String[] nadeln = new String[11];
        for (int i = 0; i < nadeln.length; i++){
            nadeln[i] = " ";
        }
        nadeln[nadeln.length / 2] = "*";
        int positionl = nadeln.length / 2 - 1;
        int positionr = nadeln.length / 2 + 1;
        for(int i = 0; i < nadeln.length / 2; i++){
            for (String number : nadeln){
                System.out.print(number);}
            nadeln[positionl] = "*";
            nadeln[positionr] = "*";
            positionl -= 1;
            positionr += 1;
            System.out.print("\n");
        }
    }
}