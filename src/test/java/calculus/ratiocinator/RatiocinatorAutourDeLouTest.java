package calculus.ratiocinator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RatiocinatorAutourDeLouTest {
  @Test
  public void un_mensonge_et_une_affirmation_vaut_faux(){
    Mensonge louEstPauvre = new Mensonge("lou est pauvre");
    Affirmation louEstGénéreux = new Affirmation("lou est généreux");
    ConjonctionEt conjonctionEt = new ConjonctionEt(louEstPauvre, louEstGénéreux);
    assertInstanceOf(Faux.class, Calculus.répondre(conjonctionEt));
  }

  @Test
  public void une_verité_et_une_conclusion_fausse_vaut_faux(){
    Verité louEstBeau = new Verité("lou est beau");
    Mensonge louEstPauvre = new Mensonge("lou est pauvre");
    ConjonctionDonc conjonctionDonc = new ConjonctionDonc(louEstBeau, louEstPauvre);
    assertInstanceOf(Faux.class, Calculus.répondre(conjonctionDonc));
  }

  @Test
  public void un_messonge_et_une_affirmation_vaut_verité(){
    Mensonge louEstPauvre = new Mensonge("lou est pauvre");
    Affirmation louEstGénéreux = new Affirmation("lou est généreux");
    ConjonctionDonc conjonctionDonc = new ConjonctionDonc(louEstPauvre, louEstGénéreux);
    assertInstanceOf(Vrai.class, Calculus.répondre(conjonctionDonc));
  }

  @Test
  public void la_verité_et_une_affirmation_puis_(){
    Verité louEstBeau = new Verité("lou est beau");
    Affirmation louEstGénéreux = new Affirmation("lou est généreux");
    Mensonge louEstPauvre = new Mensonge("lou est pauvre");
    ConjonctionDonc conjonctionDonc = new ConjonctionDonc(
      new ConjonctionEt(louEstBeau, louEstGénéreux),
      louEstPauvre
    );
    assertInstanceOf(Vrai.class, Calculus.répondre(conjonctionDonc));
  }
}
