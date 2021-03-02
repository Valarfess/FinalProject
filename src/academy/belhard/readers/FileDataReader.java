package academy.belhard.readers;

import java.util.List;

public interface FileDataReader<T> {

    List<T> read();
}