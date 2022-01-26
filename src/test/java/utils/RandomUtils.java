package utils;

import lombok.Data;

@Data
public class RandomUtils {
    private static double randomNumber = Math.random() * 28;

    public static String getRandomNumber() {
        return String.valueOf((int)randomNumber);
    }
}