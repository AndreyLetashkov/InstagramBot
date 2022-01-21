package utils;

import aquality.selenium.core.utilities.JsonSettingsFile;

public class ParserUtils {
    public static String parseTestData(String text) {
        return new JsonSettingsFile("testData.json").getValue(String.format("/%s", text)).toString();
    }

    public static String parseConfig(String text) {
        return new JsonSettingsFile("config.json").getValue(String.format("/%s", text)).toString();
    }

    public static String parsePath(String text) {
        return new JsonSettingsFile("path.json").getValue(String.format("/%s", text)).toString();
    }
}