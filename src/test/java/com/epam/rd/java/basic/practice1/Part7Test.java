package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part7Test {

    @Test
    public void str2intTest(){
        Assert.assertEquals(Part7.str2int("A"),1);
        Assert.assertEquals(Part7.str2int("B"),2);
        Assert.assertEquals(Part7.str2int("Z"),26);
        Assert.assertEquals(Part7.str2int("AA"),27);
        Assert.assertEquals(Part7.str2int("AZ"),52);
        Assert.assertEquals(Part7.str2int("BA"),53);
        Assert.assertEquals(Part7.str2int("ZZ"),702);
        Assert.assertEquals(Part7.str2int("AAA"),703);
    }

    @Test
    public void int2strTest(){
        Assert.assertEquals(Part7.int2str(1),"A");
        Assert.assertEquals(Part7.int2str(2),"B");
        Assert.assertEquals(Part7.int2str(26),"Z");
        Assert.assertEquals(Part7.int2str(27),"AA");
        Assert.assertEquals(Part7.int2str(52),"AZ");
        Assert.assertEquals(Part7.int2str(53),"BA");
        Assert.assertEquals(Part7.int2str(702),"ZZ");
        Assert.assertEquals(Part7.int2str(703),"AAA");
    }

    @Test
    public void rightColumnTest(){
        Assert.assertEquals(Part7.rightColumn("A"), "B");
        Assert.assertEquals(Part7.rightColumn("Z"), "AA");
        Assert.assertEquals(Part7.rightColumn("AZ"), "BA");
        Assert.assertEquals(Part7.rightColumn("ZZ"), "AAA");
    }

}