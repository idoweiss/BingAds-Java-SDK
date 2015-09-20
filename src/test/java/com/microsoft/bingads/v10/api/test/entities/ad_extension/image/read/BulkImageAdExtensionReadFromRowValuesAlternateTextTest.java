package com.microsoft.bingads.v10.api.test.entities.ad_extension.image.read;

import com.microsoft.bingads.v10.api.test.entities.ad_extension.image.BulkImageAdExtensionTest;
import com.microsoft.bingads.v10.bulk.entities.BulkImageAdExtension;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class BulkImageAdExtensionReadFromRowValuesAlternateTextTest extends BulkImageAdExtensionTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test text", "Test text"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Alternative Text", this.datum, this.expectedResult, new Function<BulkImageAdExtension, String>() {
            @Override
            public String apply(BulkImageAdExtension c) {
                return c.getImageAdExtension().getAlternativeText();
            }
        });
    }
}
