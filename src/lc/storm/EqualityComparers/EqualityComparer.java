package lc.storm.EqualityComparers;

import lc.storm.Mismatch;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Collection;

public interface EqualityComparer {
    /**
     * Should return all mismatches where the right stream differs from the left stream.
     *
     * The method should not close or handle the stream!
     * @param left original file
     * @param right file that is to be searched for mismatches
     * @return all mismatches in the file
     * @throws EqualityComparerException when the comparison fails
     */
    Collection<Mismatch> compare(BufferedReader left, BufferedReader right) throws EqualityComparerException;
}
