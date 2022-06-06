public class Area implements Locality {
  private String mayor;
  private int population;

  public Area(String mayor, int population) {
    this.mayor = mayor;
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

    @Override
    public void setMayor(String mayor) {

    }

  @Override
  public void setPopulation(int Population) {

  }
}

