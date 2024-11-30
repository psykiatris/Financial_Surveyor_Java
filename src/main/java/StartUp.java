import account.CreditCards;

// Implicit class
public static void main(String[] args) {
    StartUp.args = args;

    CreditCards myCC = new CreditCards();
    myCC.setPrincipal(453.22);
    myCC.setInterestRate(4.5);
    myCC.setStartDate(LocalDate.parse("2024-06-30"));

    // Testing - will remove later in production
    // Retrieve info
    myCC.printCurrentdate();
    System.out.println("Start date: " + myCC.getStartDate());
    System.out.println("Principal: " + myCC.getPrincipal());
    System.out.println("Interest Rate: " + myCC.getInterestRate());

}

        private static String[] args;
