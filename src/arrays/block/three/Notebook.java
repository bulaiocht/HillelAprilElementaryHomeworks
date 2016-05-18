package arrays.block.three;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * This class stores notebook entries.
 * Created by Vitalii Kocherga on 21.04.2016.
 */
public class Notebook {
    private NbookEntry entry;
    private ArrayList<NbookEntry> entries;

    public void addEntry(NbookEntry entry) {
        this.entries.add(entry);
    }

    public StringBuffer getEntries() {
        StringBuffer buffer = new StringBuffer();
        for (NbookEntry entry : entries) {
            buffer.append(entry.toString());
        }
        return buffer;
    }
}
