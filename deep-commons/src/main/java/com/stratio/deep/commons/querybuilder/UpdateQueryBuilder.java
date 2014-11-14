/**
 * 
 */
package com.stratio.deep.commons.querybuilder;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.stratio.deep.commons.entity.Cells;

/**
 *
 */
public abstract class UpdateQueryBuilder implements Serializable {

    private String catalogName;
    private String tableName;

    /**
     * Returns a CQL query
     *
     * @param keys
     * @param values
     * 
     * @return the query statement.
     */
    public abstract String prepareQuery(Cells keys, Cells values);

    /**
     * Returns a CQL batch query wrapping the given statements.
     * 
     * @param statements
     *            the list of statements to use to generate the batch statement.
     * @return the batch statement.
     */
    public abstract String prepareBatchQuery(List<String> statements);

    public final void setCatalogName(String catalog){
        this.catalogName=catalog;
    }

    public final void setTableName(String table){
        this.tableName=table;
    }

    public final String getCatalogName() {
        return catalogName;
    }

    public final String getTableName() {
        return tableName;
    }


}
