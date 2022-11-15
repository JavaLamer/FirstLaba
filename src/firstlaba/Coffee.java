package firstlaba;

public class Coffee extends food {
    private String aroma;

    public Coffee(String aroma) {
        super("Coffee");
        this.aroma = aroma;
    }
   // public void calculateCalories(){


  //  }
  @Override
  public void consume() {
      // TODO Auto-generated method stub
      System.out.println(this + " eaten ");
  }
  public String getAroma() {
      return aroma;
  }

    public void setsize(String aroma) {
        this.aroma = aroma;
    }
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Coffee)) return false; // Шаг 2
            return aroma.equals(((Coffee)arg0).aroma); // Шаг 3
        } else
            return false;
    }
    //





    public String toString() {
        return super.toString() + " aroma '" + aroma.toUpperCase() + "'";
    }
}




