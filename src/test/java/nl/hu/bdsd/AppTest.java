package nl.hu.bdsd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App app = new App();
    List<App.Student> students;

    @Before
    public void setUp() throws Exception {
        this.students = app.createList();
    }

    @Test
    public void minimumAge() {
        assertEquals(17, app.minimumAge(students), 0.0);
    }


    @Test
    public void minimumAge2() {
        assertEquals(18, app.minimumAge(students, true), 0.0);

    }

    @Test
    public void numberOfLettersInNames() {
        assertEquals(172, app.numberOfLettersInNames(students));
    }

    @Test
    public void numberOfStudentsWithNameThatBeginsWith() {
        assertEquals(2, app.numberOfStudentsWithNameThatBeginsWith(students, "Ma"));
    }
}
