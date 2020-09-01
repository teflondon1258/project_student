abstract class Task {

    @Override
    public String toString() {
        return super.toString();
    }
}
class Test extends Task implements Autochecked{

    @Override
    public boolean checkAutomatically() {
        return false;
    }
}

class DragAndDrop extends Task implements Autochecked{

    @Override
    public boolean checkAutomatically() {
        return false;
    }
}
class WriteCode extends Task implements Autochecked{

    @Override
    public boolean checkAutomatically() {
        return false;
    }
}