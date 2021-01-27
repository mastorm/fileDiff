package lc.storm.EqualityComparers;

import lc.storm.Location;
import lc.storm.Mismatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LineEqualityComparer implements EqualityComparer{

    private boolean readyToRead(Reader left, Reader right) {
        try {
            return left.ready() && right.ready();
        } catch (IOException exception) {
            return false;
        }
    }
    @Override
    public List<Mismatch> compare(BufferedReader left, BufferedReader right) throws EqualityComparerException {
        try {
            if(!readyToRead(left, right)) {
                throw new EqualityComparerException("Streams where not ready to read from!");
            }
            List<Mismatch> mismatches = new LinkedList<>();

            int rowNumber = 0;
            while(left.ready()) {
                rowNumber++;
                String leftLine = left.readLine();
                String rightLine = null;
                if(right.ready()) {
                    rightLine = right.readLine();
                } else {
                    mismatches.add(new Mismatch(new Location(rowNumber, 0), null));
                    continue;
                }

                if(!leftLine.equals(rightLine)) {
                    mismatches.add(new Mismatch(new Location(rowNumber, 0), null));
                }
            }

            return mismatches;
        } catch (IOException exception) {
            throw new EqualityComparerException(exception);
        }
    }
}
