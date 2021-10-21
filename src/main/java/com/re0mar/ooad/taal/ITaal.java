package com.re0mar.ooad.taal;

public interface ITaal {

    public String getToetsIntro(String toetsCode);

    public String getKortAntwoordText();

    public String getMeerkeuzeAntwoordText();

    public String getGoodResponse(int punt);

    public String getBadResponse(int punt);

    public String getTestInfo(String name, String code);

    public String getWelkom(String naam);

    public String getEnd();

    public String getSafe();
}
