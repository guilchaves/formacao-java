package br.com.guilherme.java.io.test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TestUnicodeEEncoding {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("windows-1252");
        System.out.println(bytes.length + ", windows-1252, " );
        String sNew = new String(bytes, "windows-1252");
        System.out.println(sNew);

        bytes = s.getBytes( "UTF-16");
        System.out.println(bytes.length + ", UTF-16, ");
        sNew = new String(bytes, "UTF-16");
        System.out.println(sNew);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes.length + ", US-ASCII, ");
        sNew = new String(bytes, "US-ASCII");
        System.out.println(sNew);

    }
}