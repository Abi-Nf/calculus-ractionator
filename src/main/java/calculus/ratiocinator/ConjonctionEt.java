package calculus.ratiocinator;

public final class ConjonctionEt extends ConjonctionDeCoordination {
  private Réponse réponse = new Faux();

  public ConjonctionEt(Affirmation affirmation1, Affirmation affirmation2){
    if(affirmation1 instanceof Verité && affirmation2 instanceof Verité){
      this.réponse = new Vrai();
    }
  }

  public ConjonctionEt(ConjonctionDeCoordination conjonction, Affirmation affirmation2){
    if(conjonction.laRéponse() instanceof Vrai && affirmation2 instanceof Verité){
      this.réponse = new Vrai();
    }else if(conjonction.laRéponse() instanceof JeNeSaisPas && !(affirmation2 instanceof Mensonge || affirmation2 instanceof Verité)){
      this.réponse = new JeNeSaisPas();
    }
  }

  public ConjonctionEt(ConjonctionDeCoordination conjonction1, ConjonctionDeCoordination conjonction2) {
    if(conjonction1.laRéponse() instanceof Vrai && conjonction2.laRéponse() instanceof Vrai){
      this.réponse = new Vrai();
    }else if(conjonction1.laRéponse() instanceof JeNeSaisPas && conjonction2.laRéponse() instanceof JeNeSaisPas){
      this.réponse = new JeNeSaisPas();
    }
  }

  @Override
  public Réponse laRéponse() {
    return réponse;
  }
}
