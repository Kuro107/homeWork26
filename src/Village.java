public class Village implements Locality{
   private String mayor;
   private int population;

    public void setMayor(String mayor) {
        this.mayor = mayor;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String getMayor() {
        return this.mayor;
    }

    @Override
    public int getPopulation() {
        return this.population;
    }
}
