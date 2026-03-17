package com.kc;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String buildPattern(String[] keywords) {

        StringBuilder sb = new StringBuilder();
        for (String keyword : keywords) {
            sb.append(keyword).append("|");
        }

        if (sb.length() >= 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        buildPattern(new String[]{});
    }
}