package calculus.ratiocinator;

public class Calculus {
  public static Réponse répondre(ConjonctionDeCoordination conjonction){
    if(conjonction == null || conjonction.laRéponse() instanceof JeNeSaisPas) return new JeNeSaisPas();
    if(conjonction.laRéponse() instanceof Vrai) return new Vrai();
    return new Faux();
  }
}
