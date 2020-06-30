package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part7Test {

    @Test
    public void str2intTest(){
        Assert.assertEquals(1, Part7.str2int("A"));
        Assert.assertEquals(2, Part7.str2int("B"));
        Assert.assertEquals(26, Part7.str2int("Z"));
        Assert.assertEquals(27, Part7.str2int("AA"));
        Assert.assertEquals(52, Part7.str2int("AZ"));
        Assert.assertEquals(53, Part7.str2int("BA"));
        Assert.assertEquals(702, Part7.str2int("ZZ"));
        Assert.assertEquals(703, Part7.str2int("AAA"));

    }
    
    @Test
    public void int2strTest(){
        Assert.assertEquals("A", Part7.int2str(1));
        Assert.assertEquals("B", Part7.int2str(2));
        Assert.assertEquals("Z", Part7.int2str(26));
        Assert.assertEquals("AA", Part7.int2str(27));
        Assert.assertEquals("AZ", Part7.int2str(52));
        Assert.assertEquals("BA", Part7.int2str(53));
        Assert.assertEquals("ZZ", Part7.int2str(702));
        Assert.assertEquals("AAA", Part7.int2str(703));

    }

    @Test
    public void rightColumnTest(){
        Assert.assertEquals("B", Part7.rightColumn("A"));
        Assert.assertEquals("AA", Part7.rightColumn("Z"));
        Assert.assertEquals("BA", Part7.rightColumn("AZ"));
        Assert.assertEquals("AAA", Part7.rightColumn("ZZ"));
    }

}