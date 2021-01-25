package filehandling;

import java.io.IOException;
import java.io.InputStream;

public interface FileHandling {
    /**
     *  A methode to remove files from Local computer
     * @param filename expected the filename to remove the rigth file
     * @throws IOException  throws when it fails to build an steam
     */
    void removeFile(String filename)throws IOException;

    /**
     * create a new non existing file
     * @param filename filename of the new file
     * @param is expected an Inputstream to fill the file
     * @throws IOException when it fails build the Stream
     */
    void createFile(String filename, InputStream is)throws IOException;

    /**
     * copys a file to remote pc
     * @param filename filename to copy the file
     * @throws IOException when it fails to build an stream
     */
    void copyFileToRemotePC(String filename,boolean toRemote)throws IOException;
}
