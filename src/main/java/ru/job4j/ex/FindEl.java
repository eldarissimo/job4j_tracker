package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        boolean rsl = false;
        for (int i = 0; i < abuses.length; i++) {
            if (abuses[i].equals(value)) {
                return true;
            }
        }
        if (!rsl) {
            throw new ElementAbuseException("Word is not allowed");
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Throwable ea) {
            ea.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"back", "get back", "come back"}, "back");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        try {
            process(new String[]{"back", "get back", "come back"}, "back", new String[]{"back"});
        } catch (Exception en) {
            en.printStackTrace();
        }
    }
}