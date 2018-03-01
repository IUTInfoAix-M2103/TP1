package fr.univ_amu.iut.exercice5;

import org.junit.Ignore;
import org.junit.Test;

import static fr.univ_amu.iut.exercice5.ArgsException.ErrorCode.*;
import static org.junit.Assert.*;

public class ArgsTest {

    @Ignore
    @Test
    public void testCreateWithNoSchemaOrArguments() throws Exception {
        Args args = new Args("", new String[0]);
        assertEquals(0, args.nextArgument());
    }

    @Ignore
    @Test
    public void testWithNoSchemaButWithOneArgument() throws Exception {
        try {
            new Args("", new String[]{"-x"});
            fail();
        } catch (ArgsException e) {
            assertEquals(UNEXPECTED_ARGUMENT, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
        }
    }

    @Ignore
    @Test
    public void testWithNoSchemaButWithMultipleArguments() throws Exception {
        try {
            new Args("", new String[]{"-x", "-y"});
            fail();
        } catch (ArgsException e) {
            assertEquals(UNEXPECTED_ARGUMENT, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
        }

    }

    @Ignore
    @Test
    public void testNonLetterSchema() throws Exception {
        try {
            new Args("*", new String[]{});
            fail("Args constructor should have thrown exception");
        } catch (ArgsException e) {
            assertEquals(INVALID_ARGUMENT_NAME, e.getErrorCode());
            assertEquals('*', e.getErrorArgumentId());
        }
    }

    @Ignore
    @Test
    public void testInvalidArgumentFormat() throws Exception {
        try {
            new Args("f~", new String[]{});
            fail("Args constructor should have thrown exception");
        } catch (ArgsException e) {
            assertEquals(INVALID_ARGUMENT_FORMAT, e.getErrorCode());
            assertEquals('f', e.getErrorArgumentId());
        }
    }

    @Ignore
    @Test
    public void testSimpleBooleanPresent() throws Exception {
        Args args = new Args("x", new String[]{"-x"});
        assertEquals(true, args.getBoolean('x'));
        assertEquals(1, args.nextArgument());
    }

    @Ignore
    @Test
    public void testSimpleStringPresent() throws Exception {
        Args args = new Args("x*", new String[]{"-x", "param"});
        assertTrue(args.has('x'));
        assertEquals("param", args.getString('x'));
        assertEquals(2, args.nextArgument());
    }

    @Ignore
    @Test
    public void testMissingStringArgument() throws Exception {
        try {
            new Args("x*", new String[]{"-x"});
            fail();
        } catch (ArgsException e) {
            assertEquals(MISSING_STRING, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
        }
    }

    @Ignore
    @Test
    public void testSpacesInFormat() throws Exception {
        Args args = new Args("x, y", new String[]{"-xy"});
        assertTrue(args.has('x'));
        assertTrue(args.has('y'));
        assertEquals(1, args.nextArgument());
    }

    @Ignore
    @Test
    public void testSimpleIntPresent() throws Exception {
        Args args = new Args("x#", new String[]{"-x", "42"});
        assertTrue(args.has('x'));
        assertEquals(42, args.getInt('x'));
        assertEquals(2, args.nextArgument());
    }

    @Ignore
    @Test
    public void testInvalidInteger() throws Exception {
        try {
            new Args("x#", new String[]{"-x", "Forty two"});
            fail();
        } catch (ArgsException e) {
            assertEquals(INVALID_INTEGER, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
            assertEquals("Forty two", e.getErrorParameter());
        }

    }

    @Ignore
    @Test
    public void testMissingInteger() throws Exception {
        try {
            new Args("x#", new String[]{"-x"});
            fail();
        } catch (ArgsException e) {
            assertEquals(MISSING_INTEGER, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
        }
    }

    @Ignore
    @Test
    public void testSimpleDoublePresent() throws Exception {
        Args args = new Args("x##", new String[]{"-x", "42.3"});
        assertTrue(args.has('x'));
        assertEquals(42.3, args.getDouble('x'), .001);
    }

    @Ignore
    @Test
    public void testInvalidDouble() throws Exception {
        try {
            new Args("x##", new String[]{"-x", "Forty two"});
            fail();
        } catch (ArgsException e) {
            assertEquals(INVALID_DOUBLE, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
            assertEquals("Forty two", e.getErrorParameter());
        }
    }

    @Ignore
    @Test
    public void testMissingDouble() throws Exception {
        try {
            new Args("x##", new String[]{"-x"});
            fail();
        } catch (ArgsException e) {
            assertEquals(MISSING_DOUBLE, e.getErrorCode());
            assertEquals('x', e.getErrorArgumentId());
        }
    }

    @Ignore
    @Test
    public void testExtraArguments() throws Exception {
        Args args = new Args("x,y*", new String[]{"-x", "-y", "alpha", "beta"});
        assertTrue(args.getBoolean('x'));
        assertEquals("alpha", args.getString('y'));
        assertEquals(3, args.nextArgument());
    }

    @Ignore
    @Test
    public void testExtraArgumentsThatLookLikeFlags() throws Exception {
        Args args = new Args("x,y", new String[]{"-x", "alpha", "-y", "beta"});
        assertTrue(args.has('x'));
        assertFalse(args.has('y'));
        assertTrue(args.getBoolean('x'));
        assertFalse(args.getBoolean('y'));
        assertEquals(1, args.nextArgument());
    }
}
