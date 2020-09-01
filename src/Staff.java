public interface Staff {
    void helpStudent();
    default void giveAdditionalMaterial(){
        System.out.println(" Print a message with a link to Habr");

    }
}


