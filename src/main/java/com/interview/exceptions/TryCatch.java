package com.interview.exceptions;

import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;

public class TryCatch {

    public static void main(String[] args) {

        try {
            Files.write(/* valid arguments */); // throws IOException
        } catch (RuntimeException | IOException ex) {
            // handle
        }

        // advanced
        try {
            Files.write(/* valid arguments */); // throws IOException
        } catch (RuntimeException | IllegalArgumentException ex) {

        }
    }
}
