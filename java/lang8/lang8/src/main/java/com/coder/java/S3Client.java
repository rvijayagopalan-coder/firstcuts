package com.coder.java;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;

public class S3Client {
    private final S3Client s3Client;

    public S3Client() {
        this.s3Client = S3Client.builder()
                .region(Region.US_WEST_2)  // Change this to your desired region
                .build();
    }

    public S3Client(Region region) {
        this.s3Client = S3Client.builder()
                .region(region)
                .build();
    }

    public S3Client getClient() {
        return s3Client;
    }
}