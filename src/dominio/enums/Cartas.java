/*
*
*/
package dominio.enums;

/**
 * The Enum Cartas.
 */
public enum Cartas {

  /** The um. */
  UM(1, 0, "Passa a vez para o jogador seguinte"),

  /** The tres. */
  TRES(3, 1, "Elimina o terceiro jogador apartir do atual"),

  /** The nove. */
  NOVE(9, 2, "Elimina o jogador da jogada anterior"),

  /** The treze. */
  TREZE(13, 3, "Inverte o sentido do jogo");

  /** The name. */
  private final int name;

  /** The value. */
  private final int value;

  /** The acao. */
  private final String acao;

  /**
   * Instantiates a new cartas.
   *
   * @param pname
   *          the pname
   * @param pvalue
   *          the pvalue
   * @param pacao
   *          the pacao
   */
  private Cartas(int pname, int pvalue, String pacao) {
    this.name = pname;
    this.value = pvalue;
    this.acao = pacao;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public int getName() {
    return name;
  }

  /**
   * Gets the value.
   *
   * @return the value
   */
  public int getValue() {
    return value;
  }

  /**
   * Gets the acao.
   *
   * @return the acao
   */
  public String getAcao() {
    return acao;
  }

}
