package remote;

import filehandling.FileHandling;

import java.io.IOException;

public interface Remote extends FileHandling{
    void acceptConnection(String hostname, int Port)throws IOException;
    void remoteControlle(int x);
}
