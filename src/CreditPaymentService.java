public class CreditPaymentService {
    public double calculate(int months, double amountCredit, double interestRate) {
        double monthlyInterestRate = interestRate / 12 / 100;
        double monthlyPayment = amountCredit * (monthlyInterestRate + monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, months) - 1));
        return (int) monthlyPayment;
    }
}
