package main;

public class OtherMethods {
    String text;

    public boolean exitProgramm(String text) {
        this.text = text;
        if (text.equals("Exit")) {
            return true;
        }
        if (text.equals("Stop")) {
            return true;
        }
        return false;
    }
}
