public class Animale{
    private String specie;
    private String verso;

    public Animale(String specie, String verso) {
        this.specie = specie;
        this.verso = verso;

    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie){
        this.specie = specie;
    }
    public String getVerso() {
        return verso;
    }
    public void setVerso(String verso){
        this.verso = verso;
    }
    @Override
    public String toString(){
        return "io sono un animale";
    }

    public static void faiIlVerso(){

        System.out.println("");
    }





}
