package local;

import filehandling.FileHandling;

import java.io.IOException;

public interface Local extends FileHandling {
    /**
     * connect to a remote pc
     * @throws Exception when it fails to build a connection
     */
    void connect()throws Exception;

    /**
     * remove a file from a remote controlled pc
     * @param filename filename to remove the file
     * @throws IOException when it fails to build an stream
     */
    void remoteRemoveFile(String filename) throws IOException;

    /**
     * copy a file from a remote controlled pc
     * @param filename filename to copy the file
     * @throws IOException when it fails to build an stream
     */
    void remoteCopyFile(String filename)throws IOException;
}
