

public class Spil2 {
    //-----------------------------------------------------------------
    //  Creates some bank accounts and requests various services.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        Konto acct1 = new Konto("P1Money", 1, 1000);
        Konto acct2 = new Konto("P2Money", 2, 1000);

        Die die1pl1, die2pl1;
        int sum1;


        die1pl1= new Die();
        die2pl1 = new Die();
        acct1.getBalance();
        acct2.getBalance();

while((acct1.getBalance()< 3000)&&(acct2.getBalance()<3000) ) {

    do {
        die1pl1.roll();
        die2pl1.roll();

        System.out.println();
        System.out.println("Spiller1 slår");
        System.out.println("Die One: " + die1pl1 + ", Die Two: " + die2pl1);


        sum1 = die1pl1.getFaceValue() + die2pl1.getFaceValue();
        System.out.println("Sum: " + sum1);


        if (sum1 == 2) {
            double P1Balance = acct1.deposit(250);
            System.out.println("Player1 er landet på Tower. Du får tilføjet 250 til din pengebeholdning" + '\n'+"Player1s konto efter udbetaling: " +
                    P1Balance);
        }

        if (sum1 == 3) {
            System.out.println("Player1 er landet på Crater. Du får  trukket 100 fra din pengebeholdning" + '\n'+"Player1s konto efter tilbagetrækning: " +
                    acct1.withdraw(100));
        }
        if (sum1 == 4) {
            double P1Balance = acct1.deposit(100);
            System.out.println("Player1 er landet på Palace gates. Du får  tilføjet 100 til din pengebeholdning" + '\n'+"Player1s konto efter udbetaling: " +
                    P1Balance);
        }
        if (sum1 == 5) {
            System.out.println("Player1 er landet på Cold Desert. Du får trukket 20 fra din pengebeholdning" + '\n'+"Player1s konto efter tilbagetrækning: " +
                    acct1.withdraw(20));
        }
        if (sum1 == 6) {
            double P1Balance = acct1.deposit(180);
            System.out.println("Player1 er landet på Walled city. Du får tilføjet 180 til din pengebeholdning" + '\n'+"Player1s konto efter udbetaling: " +
                    P1Balance);
        }
        if (sum1 == 7) {
            System.out.println("Player1 er landet på Monastery. Der sker intet med din pengebeholdning"+'\n'+
                    "Player1s konto: " + acct1.withdraw(0));
        }
        if (sum1 == 8) {
            System.out.println("Player1 er landet på Black cave. Du får trukket 70 fra din pengebeholdning" + '\n'+"Player1s konto efter tilbagetrækning: " +
                    acct1.withdraw(70));
        }
        if (sum1 == 9) {
            double P1Balance = acct1.deposit(60);
            System.out.println("Player1 er landet på Black cave. Du får tilføjet 90 til din pengebeholdning" + '\n'+"Player1s konto efter udbetalingen: " +
                    P1Balance);
        }
        if (sum1 == 10) {
            System.out.println("Player1 er landet på The Werewall. Du får trukket 80 fra din pengebeholdning, men til gengæld får du en ekstra tur.");

        }
        if (sum1 == 11) {
            System.out.println("Player1 er landet på The pit. Du får trukket 50 fra din pengebeholdning" + '\n'+"Player1s konto efter tilbagetrækning: " +
                    acct1.withdraw(50));
        }
        if (sum1 == 12) {
            double P1Balance = acct1.deposit(650);
            System.out.println("Player1 er landet på Goldmine. Æææft du har ramt jackpot! Tillykke, du får tilføjet 650 til din pengebeholdning" + '\n'+"Player1s konto efter udbetaling: " +
                    P1Balance);
        }


        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
    }
while (sum1==10);


    Die die1pl2, die2pl2;
    int sum2;
    do {

    die1pl2 = new Die();
    die2pl2 = new Die();

    die1pl2.roll();
    die2pl2.roll();

    System.out.println();
    System.out.println("Spiller2 slår");

    System.out.println("Die One: " + die1pl2 + ", Die Two: " + die2pl2);


    sum2 = die1pl2.getFaceValue() + die2pl2.getFaceValue();
    System.out.println("Sum: " + sum2);


    if (sum2 == 2) {
        double P2Balance = acct2.deposit(250);
        System.out.println("Player2 er landet på Tower. Du får tilføjet 250 til din pengebeholdning" + '\n'+"Player2s konto efter udbetaling: " +
                P2Balance);
    }

    if (sum2 == 3) {
        System.out.println("Player2 er landet på Crater. Du får  trukket 100 fra din pengebeholdning" + '\n'+"Player2s konto efter tilbagetrækning: " +
                acct2.withdraw(100));
    }
    if (sum2 == 4) {
        double P2Balance = acct2.deposit(100);
        System.out.println("Player2 er landet på Palace gates. Du får  tilføjet 100 til din pengebeholdning" + '\n'+"Player2s konto efter udbetaling: " +
                P2Balance);
    }
    if (sum2 == 5) {
        System.out.println("Player2 er landet på Cold Desert. Du får trukket 20 fra din pengebeholdning" + '\n'+"Player2s konto efter tilbagetrækning: " +
                acct2.withdraw(20));
    }
    if (sum2 == 6) {
        double P2Balance = acct2.deposit(180);
        System.out.println("Player2 er landet på Walled city. Du får tilføjet 180 til din pengebeholdning" + '\n'+"Player2s konto efter udbetaling: "+
                P2Balance);
    }
    if (sum2 == 7) {
        double P2Balance = acct2.deposit(0);
        System.out.println("Player2 er landet på Monastery. Der sker intet med din pengebeholdning"+'\n'+
                "Player2s konto: " +
                P2Balance);

    }
    if (sum2 == 8) {
        System.out.println("Player2 er landet på Black cave. Du får trukket 70 fra din pengebeholdning" + '\n'+"Player2s konto efter tilbagetrækning: " +
                acct2.withdraw(70));
    }
    if (sum2 == 9) {
        double P2Balance = acct2.deposit(60);
        System.out.println("Player2 er landet på Black cave. Du får tilføjet 90 til din pengebeholdning" + '\n'+"Player2s konto efter udbetalingen: " +
                P2Balance);
    }
    if (sum2 == 10) {
        System.out.println("Player2 er landet på The Werewall. Du får trukket 80 fra din pengebeholdning, men til gengæld får du en ekstra tur." + acct2.withdraw(50));
    }
    if (sum2 == 11) {
        System.out.println("Player2 er landet på The pit. Du får trukket 50 fra din pengebeholdning" + '\n'+"Player2s konto efter tilbagetrækning: " +
                acct2.withdraw(50));
    }
    if (sum2 == 12) {
        double P2Balance = acct2.deposit(650);
        System.out.println("Player2 er landet på Goldmine. Æææft du har ramt jackpot! Tillykke, du får tilføjet 650 til din pengebeholdning" + '\n'+"Player2s konto efter udbetaling: " +
                P2Balance);
    }


    System.out.println();
    System.out.println(acct1);
    System.out.println(acct2);
}
while(sum2==10);
}
}
}
