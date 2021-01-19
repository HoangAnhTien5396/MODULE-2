import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TriangleClassifierTest {
@Test
    void testTriangle222(){
    double edgeA = 2;
    double edgeB = 2;
    double edgeC = 2;
    String expected = "Is Isosceles";
    String result = TriangleClassifier.triangleClassifier(edgeA,edgeB,edgeC);
    assertEquals(expected,result);
}@Test
    void testTriangle223(){
    double edgeA = 2;
    double edgeB = 2;
    double edgeC = 3;
    String expected = "Is equilateral";
    String result = TriangleClassifier.triangleClassifier(edgeA,edgeB,edgeC);
    assertEquals(expected,result);
}@Test
    void testTriangle345(){
    double edgeA = 3;
    double edgeB = 4;
    double edgeC = 5;
    String expected = "Is triangle";
    String result = TriangleClassifier.triangleClassifier(edgeA,edgeB,edgeC);
    assertEquals(expected,result);
}
@Test
void testTriangle121(){
    double edgeA = -1;
    double edgeB = 2;
    double edgeC = 1;
    String expected = "Is not Triangle";
    String result = TriangleClassifier.triangleClassifier(edgeA,edgeB,edgeC);
    assertEquals(expected,result);
}
@Test
void testTriangle823(){
    double edgeA = 8;
    double edgeB = 2;
    double edgeC = 3;
    String expected = "Is not Triangle";
    String result = TriangleClassifier.triangleClassifier(edgeA,edgeB,edgeC);
    assertEquals(expected,result);
}
    @Test
    void testTriangle011() {
        double edgeA = 0;
        double edgeB = 1;
        double edgeC = 1;
        String expected = "Is not Triangle";
        String result = TriangleClassifier.triangleClassifier(edgeA, edgeB, edgeC);
        assertEquals(expected, result);

    }
}
