package rs.srb.emir.four.table.pitanja;

public class Sington {
    private static Sington INSTANCE;

    public Sington() {

    }
    public static Sington getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Sington();
        }
        return INSTANCE;
    }
}
