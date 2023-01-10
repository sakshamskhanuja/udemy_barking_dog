public class Main {
    public static void main(String[] args) {
        // Checks if we should wake up at 1am when the dog is barking.
        System.out.println(shouldWakeUp(true, 1));

        // Checks if we should wake up at 2am when the dog is not barking.
        System.out.println(shouldWakeUp(false, 2));

        // Checks if we should wake up at 8am when the dog is barking.
        System.out.println(shouldWakeUp(true, 8));

        // Checks if we should wake up at -1am when the dog is barking.
        System.out.println(shouldWakeUp(true, -1));
    }

    /**
     * Checks if we need to wake up when the dog is barking.
     *
     * @param barking   Whether dog is barking or not.
     * @param hourOfDay At which hour during the day or night is the dog barking.
     * @return true, if we should wake up, otherwise false.
     */
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // Checks if we need to wake up.
        return (barking && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >= 0 && hourOfDay <= 23));
    }
}