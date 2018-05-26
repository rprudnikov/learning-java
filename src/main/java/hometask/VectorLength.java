package hometask;

public class VectorLength {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 0;

        int vectorLength = (int) Math.sqrt(x * x + y * y + z * z);
        int unitVectorX = x / vectorLength;
        int unitVectorY = y / vectorLength;
        int unitVectorZ = z / vectorLength;

        System.out.printf("Единичный вектор для вектора (%d, %d, %d) => (%d, %d, %d)", x, y, z, unitVectorX, unitVectorY, unitVectorZ);

    }
}
