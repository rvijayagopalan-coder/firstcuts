package com.coder.java;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create S3 client
        com.coder.java.S3Client s3Wrapper = new com.coder.java.S3Client();
        System.out.println("Successfully connected to AWS S3!");
    }
}
