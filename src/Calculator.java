//do dwóch zmiennych przypiszesz dwie dowolne wartości (wybierz najbardziej odpowiedni Twoim zdaniem typ danych)
//obliczysz wyniki dodawania, odejmowania, mnożenia i dzielenia i zapamiętasz je w nowych, osobnych zmiennych
//wyświetlisz wynik poszczególnych działań w konsoli w postaci jak przedstawiono poniżej
//Przetestuj działanie programu dla różnych typów danych i wartości, przykładowy wynik:
//
//12.0 + 5.5 = 17.5
//12.0 - 5.5 = 6.5
//12.0 * 5.5 = 66.0
//12.0 / 5.5 = 2.1818181818181817
public class Calculator {
    public static void main(String[] args) {
        double number1=5.5;
        double number2=2;
        double additionResult= number1+number2;
        double subtractionResult = number1 - number2;
        double multiplicationResult= number1 * number2;
        double divisionResult = number1 / number2;

        System.out.println(number1 + " + " + number2 + " = "+ additionResult);
        System.out.println(number1 + " - " + number2 + " = "+ subtractionResult);
        System.out.println(number1 + " * " + number2 + " = "+ multiplicationResult);
        System.out.println(number1 + " / " + number2 + " = "+ divisionResult);


    }
}
