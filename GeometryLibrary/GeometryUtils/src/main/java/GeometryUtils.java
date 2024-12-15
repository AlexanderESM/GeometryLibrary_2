public class GeometryUtils {
    public static double convertUnits(double value, double conversionRate) {
        return value * conversionRate;
    }

    public static String compareAreas(double area1, double area2) {
        if (area1 > area2) {
            return "The first figure has a larger area.";
        } else if (area1 < area2) {
            return "The second figure has a larger area.";
        } else {
            return "Both figures have the same area.";
        }
    }
}