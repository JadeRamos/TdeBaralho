package dominio.interfaces;

import dominio.Binode;
import dominio.enums.OrderType;
import dominio.enums.SearchType;
import dominio.enums.SortType;

/**
 * The Interface Lista.
 * @param <T>
 */
public interface Lista<T> {

  /**
   * Checks if is list void.
   *
   * @return true, if is list void
   */
  boolean isListVoid();

  /**
   * Insert nod.
   *
   * @param info
   *          the info
   */
  void insertBinode(T pElem);

  /**
   * Removebinode.
   *
   * @param info
   *          the info
   * @return the binode
   */
  Binode<T> removeBinode(T info);

  /**
   * Searchbinode.
   *
   * @param tipo
   *          the tipo
   * @param info
   *          the info
   * @return the binode
   */
  Binode<T> searchBinode(SearchType tipo, T info);

  /**
   * Order list.
   *
   * @param ordem
   *          the ordem
   * @param sentido
   *          the sentido
   */
  void orderList(SortType ordem, OrderType sentido);

}
