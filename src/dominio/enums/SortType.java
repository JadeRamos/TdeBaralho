/*
*
*/
package dominio.enums;

/**
 * The Enum SortType.
 */
public enum SortType {

  /** The bubble sort. */
  BUBBLE_SORT("bubble"), /** The selection sort. */
  SELECTION_SORT("select"), /** The merge sort. */
  MERGE_SORT("merg");

  /** The tipo. */
  private final String tipo;

  /**
   * Instantiates a new sort type.
   *
   * @param ptipo   the tipo
   */
  private SortType(final String ptipo) {
    this.tipo = ptipo;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String getType() {
    return this.tipo;
  }
}
