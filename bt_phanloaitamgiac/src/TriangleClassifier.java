public class TriangleClassifier {
    public static String triangleClassifier(double edgeA, double edgeB, double edgeC) {
        String typeTriangle = null;
        if (edgeA <= 0 || edgeB <= 0 || edgeC <= 0) {
            typeTriangle = "Is not Triangle";
        } else {
            if (edgeA + edgeB <= edgeC || edgeB + edgeC <= edgeA || edgeA + edgeC <= edgeB) {
            typeTriangle = "Is not Triangle";
        } else if (edgeA == edgeB && edgeA == edgeC) {
                typeTriangle = "Is Isosceles";
            } else if (edgeA == edgeB || edgeA == edgeC || edgeB == edgeC) {
                typeTriangle = "Is equilateral";
            } else if (edgeA != edgeB && edgeB != edgeC && edgeC != edgeA) {
                typeTriangle = "Is triangle";
            }
        }
        return typeTriangle;
    }
}
