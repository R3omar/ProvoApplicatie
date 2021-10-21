package com.re0mar.ooad.taal;

public class Nederlands implements ITaal{
    @Override
    public String getToetsIntro(String toetsCode) {
        return "\033[93mWelkom bij kennistoets: " + toetsCode +
                "\033[35m\nOm met de toets te starten type start\n\033[0m";
    }

    @Override
    public String getKortAntwoordText() {
        return "\n Antwoord in maximaal 255 tekens: ";
    }

    @Override
    public String getMeerkeuzeAntwoordText() {
        return "\n\nNummer van correct antwoord: ";
    }

    @Override
    public String getGoodResponse(int punt) {
        return "Goed geantwoord, huidig aantal punten: " + punt + "\n";
    }

    @Override
    public String getBadResponse(int punt) {
        return "Fout geantwoord, huidig aantal punten: " + punt + "\n";
    }

    @Override
    public String getTestInfo(String name, String code) {
        return "Toets: " + name + " Code: " + code;
    }

    public String getWelkom(String naam) {
        return "Welkom bij deze kennistoets " + naam;
    }

    public String getEnd() {
        return "Toets afgerond, typ je naam om toets te beëindigen of geef het nummer in van een vraag om deze opnieuw te maken";
    }

    public String getSafe() {
        return "Resultaten opgeslagen, deze applicatie vernietigt zichzelf binnen 10 seconden\n Provo is niet verantwoordelijk voor eventuele schade aan uw apparatuur\n\n";
    }


}
