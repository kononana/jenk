public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        if (name.length() < 3 || name.length() > 19) {
            return false;
        }
        int spacecount = 0;
        for (char c : name.toCharArray()) {
            if (c == ' ') {
                spacecount += 1;
            }
        }
        if (spacecount != 1) {
                return false;
            }
        if(name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ') {
                return false;
            }
        return true;

        }
    }
