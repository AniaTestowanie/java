public class OperatoryLogiczne {
    // Działają na wartościach logicznych zwracając również wartości logiczne

    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && thirdValue);
        System.out.println(firstValue || secondValue);
        System.out.println(secondValue || fourthValue);
        System.out.println(firstValue);
        System.out.println(secondValue);
        System.out.println(firstValue && secondValue);
    }
}
