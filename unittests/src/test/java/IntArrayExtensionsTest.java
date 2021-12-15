import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayExtensionsTest {


//    @Test
//    void getMax_HappyCase() {
//        // Arrange
//        int[] testData = new int[]{2, 1, 4, 3};
//
//        // Act
//        int actual = IntArrayExtensions.getMax(testData);
//
//        // Assert
//        assertEquals(4, actual);
//    }
//    @Test
//    void getMin_HappyCase() {
//        // Arrange
//        int[] testData = new int[]{2, 1, 4, 3};
//
//        // Act
//        int actual = IntArrayExtensions.getMin(testData);
//
//        // Assert
//        assertEquals(1, actual);
//    }
//    @Test
//    void getAvarage_HappyCase() {
//        // Arrange
//        int[] testData = new int[]{2, 1, 4, 3};
//
//        // Act
//        double actual = IntArrayExtensions.getAverage(testData);
//
//        // Assert
//        assertEquals(2.5, actual);
//    }
//}
@Test
void getSort_HappyCase() {
    // Arrange
    int[] testData = new int[]{2, 1, 4, 3};

    // Act
    double actual = IntArrayExtensions.getAverage(testData);

    // Assert
    assertEquals(2.5, actual);
}
    @Test
    void getReverse_HappyCase() {
        // Arrange
        int[] testData = new int[]{2, 1, 4, 3};

        // Act
        int[] actual = IntArrayExtensions.reverse(testData);

        // Assert
        assertEquals(5.5, actual);
    }
}
