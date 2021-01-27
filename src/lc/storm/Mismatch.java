package lc.storm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Mismatch {
    private Location startingAt;
    private Location endingAt;

    public Mismatch(@NotNull Location startingAt, @Nullable Location endingAt) {
        this.startingAt = startingAt;
        this.endingAt = endingAt;
    }

    public Location getStartingAt() {
        return startingAt;
    }

    public void setStartingAt(Location startingAt) {
        this.startingAt = startingAt;
    }

    public Location getEndingAt() {
        return endingAt;
    }

    public void setEndingAt(Location endingAt) {
        this.endingAt = endingAt;
    }
}
