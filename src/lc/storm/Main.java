package lc.storm;

import lc.storm.EqualityComparers.EqualityComparer;
import lc.storm.EqualityComparers.LineEqualityComparer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    private static BufferedReader readerFromPath(String path) throws Exception {
        var file = new File(path);
        if (!file.isFile() || !file.canRead()) {
            throw new Exception("File is a folder or cant be read");
        }
        try {
            return new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new Exception(e);
        }
    }

    public static void main(String[] args) throws Exception {

        final String sep = File.separator;
        final String workingDir = "C:" + sep + "java" + sep + "comparer" + sep;

        final var left = readerFromPath(workingDir + "left.txt");
        final var right = readerFromPath(workingDir + "right.txt");

        EqualityComparer comparer = new LineEqualityComparer();
        final var mismatches = comparer.compare(left, right);

        for(var mismatch : mismatches) {
            System.out.println("Mismatch on Line " + mismatch.getStartingAt());
        }

        if(mismatches.isEmpty()) {
            System.out.println("Files are equal.");
        }
    }
}
