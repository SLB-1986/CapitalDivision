package org.example;

public class Main {
    public static void main(String[] args) {
        /** Acest prgramel reprezinta un exemplu pentru un comentariu facut online.... */
        double capital = 100.0; /** reprezinta capitalul in procent de 100%.
         Acest capital poate reprezenta PIB-ul unui stat.*/

        /* Pentru buna functionare a unei economii trebuie sa existe o divizare clara bine stabilita si transparenta.
        Restul e matematica de clasa a 4-a. */
        double salariiProcente = 30.0; // reprezinta procentul pentru salarii 30%
        double pensiiProcente = 10.0; // reprezinta procentul pentru pensii 10%
        double investitiiProcente = 10.0; // reprezinta procentul pentru investitii 10%
        double situatiiDeUrgentaProcente = 10.0; // reprezinta procentul pentru diverse situatii de urgenta 10%
        double tehnologieProcente = 10.0; // reprezinta procentul pentru investitii/achizitii in/de tehnologii 10%
        double salvareDeCapitalProcente = 10.0; // reprezinta procentul pentru salvarea de capital ca debit 10%
        double alteCheltuieliNeprevazuteProcente = 10.0; // reprezinta procentul pentru alte cheltuieli neprevazute 10%
        double rambursCreditProcente = 10.0; // reprezinta procentul pentru plati de credite 10%

        /* Impartirea capitalului pe cheltuieli concrete: */
        double salarii = (salariiProcente / 100.0) * capital;
        double pensii = (pensiiProcente / 100.0) * capital;
        double investitii = (investitiiProcente / 100.0) * capital;
        double situatiiDeUrgenta = (situatiiDeUrgentaProcente / 100.0) * capital;
        double tehnologii = (tehnologieProcente / 100.0) * capital;
        double acumulareDeCapital = (salvareDeCapitalProcente / 100.0) * capital;
        double cheltuieliNeprevazute = (alteCheltuieliNeprevazuteProcente / 100.0) * capital;
        double platiCredite = (rambursCreditProcente / 100.0) * capital;

        System.out.println("Salaries: " + salarii);
        System.out.println("Pension: " + pensii);
        System.out.println("Investments: " + investitii);
        System.out.println("Emergency Savings: " + situatiiDeUrgenta);
        System.out.println("Technology: " + tehnologii);
        System.out.println("Saving Debit: " + acumulareDeCapital);
        System.out.println("Non-Predicted Expenses: " + cheltuieliNeprevazute);
        System.out.println("Credit Payment: " + platiCredite);
    }
}