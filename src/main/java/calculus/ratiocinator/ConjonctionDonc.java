package calculus.ratiocinator;

public final class ConjonctionDonc extends ConjonctionDeCoordination {
  private Réponse réponse = new Vrai();

  public ConjonctionDonc(Affirmation affirmation1, Affirmation affirmation2) {
    if(affirmation1 instanceof Verité && affirmation2 instanceof Mensonge){
      this.réponse = new Faux();
    }
  }

  public ConjonctionDonc(ConjonctionDeCoordination conjonction1, ConjonctionDeCoordination conjonction2) {
    if(conjonction1.laRéponse() instanceof Vrai && conjonction2.laRéponse() instanceof Faux){
      this.réponse = new Faux();
    }
  }

  public ConjonctionDonc(ConjonctionDeCoordination conjonction, Affirmation affirmation) {
    if (conjonction.laRéponse() instanceof Vrai && affirmation instanceof Mensonge){
      this.réponse = new Faux();
    }
  }

  @Override
  public Réponse laRéponse() {
    return réponse;
  }
}
