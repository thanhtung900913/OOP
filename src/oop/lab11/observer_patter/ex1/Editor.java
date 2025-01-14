package lab11.Observer.ex1;

import java.io.File;

public class Editor {
    EventManager events = new EventManager();
    private File file;
    public Editor() {
        events = new EventManager();
    }
    public void openFile(String path){
        this.file = new File(path);
        events.notify("open", file.getName());
    }
    public void saveFile(String path){
        this.file = new File(path);
        events.notify("save", file.getName());
    }
}
