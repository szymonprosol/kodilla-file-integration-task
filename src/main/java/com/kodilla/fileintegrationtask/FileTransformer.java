package com.kodilla.fileintegrationtask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileTransformer {

    List<String> fileNames = new ArrayList<>();

    public String transformFile(String path) throws IOException {

        int actualvalue = path.lastIndexOf('/') + 1;
        String fileName = path.substring(actualvalue);
        fileNames.add(fileName);
        StringBuilder result = new StringBuilder();

        for (String name : fileNames) {
            result.append(name + "\n");
        }

        return result.toString();
    }
}
