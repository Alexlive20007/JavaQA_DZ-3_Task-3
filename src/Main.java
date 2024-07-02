
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int months = 12; // срок кредита
        double amountCredit = 1_000_000; // сумма кредита
        double interestRate = 9.99; // процентная ставка
        double monthlyPayment = service.calculate(months, amountCredit, interestRate);
        System.out.println("Срок кредита: " + months);
        System.out.println("Ежемесячный платеж: " + monthlyPayment);

        System.out.println();
        months = 24;
        double monthlyPayment2 = service.calculate(months, amountCredit, interestRate);
        System.out.println("Срок кредита: " + months);
        System.out.println("Ежемесячный платеж: " + monthlyPayment2);

        System.out.println();
        months = 36;
        double monthlyPayment3 = service.calculate(months, amountCredit, interestRate);
        System.out.println("Срок кредита: " + months);
        System.out.println("Ежемесячный платеж: " + monthlyPayment3);
    }
}