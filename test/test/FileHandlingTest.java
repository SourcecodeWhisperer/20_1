package test;

import local.Local;
import local.LocalImpl;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileHandlingTest {



    @Test
    public void goodtest() throws IOException {
        Local local = new LocalImpl();
        ByteArrayInputStream bais = new ByteArrayInputStream("hello".getBytes());
        local.createFile("test.txt",bais);
        File create = new File("test.txt");
        Assert.assertTrue(create.exists());
    }

    @Test(expected = IOException.class)
    public void badtest() throws IOException{
        
        Local local = new LocalImpl();
        local.createFile("test.txt",null);
    }





}