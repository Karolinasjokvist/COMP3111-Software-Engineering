/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.someLibraryMethod(), "app should have a greeting");
    }
}
