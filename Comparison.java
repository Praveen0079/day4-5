class Comparison {
    // Method to measure performance of StringBuffer
    public static long measureStringBuffer() {
        StringBuffer sb = new StringBuffer();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("hello");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Method to measure performance of StringBuilder
    public static long measureStringBuilder() {
        StringBuilder sb = new StringBuilder();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("hello");
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    // Main method for testing
    public static void main(String args[]) {
        long bufferTime = measureStringBuffer();
        long builderTime = measureStringBuilder();

        System.out.println("Time taken by StringBuffer: " + bufferTime + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + builderTime + " nanoseconds");
    }
}
