package calculus.ratiocinator;

public final class ConjonctionOu extends ConjonctionDeCoordination {
  private final Réponse réponse;

  public ConjonctionOu(Affirmation affirmation1, Affirmation affirmation2){
    this.réponse = (affirmation1 instanceof Verité || affirmation2 instanceof Verité)
      ? new Vrai()
      : new Faux();
  }

  public ConjonctionOu(ConjonctionDeCoordination conjonction, Affirmation affirmation2){
    if(conjonction.laRéponse() instanceof Vrai || affirmation2 instanceof Verité){
      this.réponse = new Vrai();
    }else if(conjonction.laRéponse() instanceof Faux || affirmation2 instanceof Mensonge){
      this.réponse = new Faux();
    }else {
      this.réponse = new JeNeSaisPas();
    }
  }

  public ConjonctionOu(ConjonctionDeCoordination conjonction, ConjonctionDeCoordination conjonction2){
    if(conjonction.laRéponse() instanceof Vrai || conjonction.laRéponse() instanceof Vrai){
      this.réponse = new Vrai();
    }else if(conjonction.laRéponse() instanceof JeNeSaisPas || conjonction2.laRéponse() instanceof JeNeSaisPas){
      this.réponse = new JeNeSaisPas();
    }else {
      this.réponse = new Faux();
    }
  }

  @Override
  public Réponse laRéponse() {
    return this.réponse;
  }
}
