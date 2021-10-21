package com.re0mar.ooad;

public class StudentController {
    private ToetsSessie sessie;
    private Student student;

    public StudentController() {
    }

    public void neemDeelAanToets(String naam, Lokaal lokaal) {
        this.sessie = lokaal.getToets();
        this.student = new Student(naam);
    }

    public String getVraag(int nr) {
        return sessie.getVraag(nr).getVraag();
    }

    public void beantwoordVraag(int nr, String antwoord) {
        student.voegAntwoordToe(sessie.getVraag(nr), new StudentAntwoord(antwoord));
    }
}
