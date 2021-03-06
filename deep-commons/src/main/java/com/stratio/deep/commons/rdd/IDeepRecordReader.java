package com.stratio.deep.commons.rdd;

import java.io.Serializable;

/**
 * Created by rcrespo on 18/08/14.
 */
public interface IDeepRecordReader<T> extends AutoCloseable  {

    boolean hasNext();

    T next();

}
