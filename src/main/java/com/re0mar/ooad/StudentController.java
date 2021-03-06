package com.re0mar.ooad;

public class StudentController {
    private ToetsSessie sessie;
    private Student student;

    public StudentController() {
    }

    public String neemDeelAanToets(String naam, Lokaal lokaal) {
        this.sessie = lokaal.getToets();
        this.student = new Student(naam);
        return sessie.getToets().getWelkom(naam);
    }

    public String getEindeToets() {
        return sessie.getToets().getEinde();
    }

    public int getToetsLength() {
        return sessie.getToets().getToetsLenght();
    }

    public String getVraag(int nr) {
        return sessie.getVraag(nr).getVraag();
    }

    public void beantwoordVraag(int nr, String antwoord) {
        student.voegAntwoordToe(sessie.getVraag(nr), new StudentAntwoord(antwoord));
    }

    public String beeindigToets() {
        //ToDo Laat controller antwoorden in database opslaan
        return sessie.getToets().getSafeMessage();
    }
}
