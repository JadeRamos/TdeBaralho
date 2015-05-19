/*
*
*/
package dominio.enums;

/**
 * The Enum SearchType.
 */
public enum SearchType {

  /** The binary search. */
  BINARY_SEARCH("binaria"), /** The sequential search. */
 SEQUENTIAL_SEARCH("sequencial");

  /** The tipo. */
  private final String tipo;

  /**
   * Instantiates a new search type.
   *
   * @param ptipo the tipo
   */
  SearchType(final String ptipo) {
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
