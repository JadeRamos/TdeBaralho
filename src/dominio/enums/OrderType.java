/*
 * Enum OrderRYpe
 * Define a ordem de classificação
 * dos elementos na lista
 */
package dominio.enums;

/**
 * The Enum OrderType.
 */
public enum OrderType {

  /** The ascendent. */
  ASCENDENT("ascendente"),
  /** The descendent. */
  DESCENDENT("descendente");

  /** The tipo. */
  private final String tipo;

  /**
   * Instantiates a new order type.
   *
   * @param ptipo the ptipo
   */
  private OrderType(final String ptipo) {
    this.tipo = ptipo;
  }

  /**
   * Gets the tipo.
   *
   * @return the tipo
   */
  public String getTipo() {
    return this.tipo;
  }
}
