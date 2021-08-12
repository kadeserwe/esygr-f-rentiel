package sn.ssi.sigmap.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import sn.ssi.sigmap.web.rest.TestUtil;

class FonctionTest {

  @Test
  void equalsVerifier() throws Exception {
    TestUtil.equalsVerifier(Fonction.class);
    Fonction fonction1 = new Fonction();
    fonction1.setId(1L);
    Fonction fonction2 = new Fonction();
    fonction2.setId(fonction1.getId());
    assertThat(fonction1).isEqualTo(fonction2);
    fonction2.setId(2L);
    assertThat(fonction1).isNotEqualTo(fonction2);
    fonction1.setId(null);
    assertThat(fonction1).isNotEqualTo(fonction2);
  }
}
