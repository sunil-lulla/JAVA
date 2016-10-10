import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class Sandbox {

    public static void main(String[] args) throws ParseException, IOException {
        FileUtils.write(new File("out.txt"), "\u221A", "UTF8");
    }


}