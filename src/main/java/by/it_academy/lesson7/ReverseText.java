package by.it_academy.lesson7;

public class ReverseText {

    public static void main(String[] args) {
        String text = "semag dnim s'tI";
        String[] arrayText = text.split("");
        for (int i = arrayText.length-1; i >= 0; i--) {
            System.out.print(arrayText[i]);
        }
    }
}
