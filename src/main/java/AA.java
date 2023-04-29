import com.mybatisflex.core.dialect.IDialect;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.row.Row;
import com.mybatisflex.core.table.TableInfo;

import java.util.List;

/**
 * create time 2023/4/26 16:23
 * 文件说明
 *
 * @author xuejiaming
 */
public class AA implements IDialect {
    @Override
    public String wrap(String s) {
        return null;
    }

    @Override
    public String forInsertRow(String s, Row row) {
        return null;
    }

    @Override
    public String forInsertBatchWithFirstRowColumns(String s, List<Row> list) {
        return null;
    }

    @Override
    public String forDeleteById(String s, String[] strings) {
        return null;
    }

    @Override
    public String forDeleteBatchByIds(String s, String[] strings, Object[] objects) {
        return null;
    }

    @Override
    public String forDeleteByQuery(QueryWrapper queryWrapper) {
        return null;
    }

    @Override
    public String forUpdateById(String s, Row row) {
        return null;
    }

    @Override
    public String forUpdateByQuery(QueryWrapper queryWrapper, Row row) {
        return null;
    }

    @Override
    public String forUpdateBatchById(String s, List<Row> list) {
        return null;
    }

    @Override
    public String forSelectOneById(String s, String[] strings, Object[] objects) {
        return null;
    }

    @Override
    public String forSelectListByQuery(QueryWrapper queryWrapper) {
        return null;
    }

    @Override
    public String forSelectCountByQuery(QueryWrapper queryWrapper) {
        return null;
    }

    @Override
    public String buildSelectSql(QueryWrapper queryWrapper) {
        return null;
    }

    @Override
    public String buildSelectCountSql(QueryWrapper queryWrapper) {
        return null;
    }

    @Override
    public String buildDeleteSql(QueryWrapper queryWrapper) {
        return null;
    }

    @Override
    public String buildWhereConditionSql(QueryWrapper queryWrapper) {
        return null;
    }

    @Override
    public String forInsertEntity(TableInfo tableInfo, Object o) {
        return null;
    }

    @Override
    public String forInsertEntityBatch(TableInfo tableInfo, List<Object> list) {
        return null;
    }

    @Override
    public String forDeleteEntityById(TableInfo tableInfo) {
        return null;
    }

    @Override
    public String forDeleteEntityBatchByIds(TableInfo tableInfo, Object[] objects) {
        return null;
    }

    @Override
    public String forDeleteEntityBatchByQuery(TableInfo tableInfo, QueryWrapper queryWrapper) {
        return null;
    }

    @Override
    public String forUpdateEntity(TableInfo tableInfo, Object o, boolean b) {
        return null;
    }

    @Override
    public String forUpdateEntityByQuery(TableInfo tableInfo, Object o, boolean b, QueryWrapper queryWrapper) {
        return null;
    }

    @Override
    public String forSelectOneEntityById(TableInfo tableInfo) {
        return null;
    }

    @Override
    public String forSelectEntityListByIds(TableInfo tableInfo, Object[] objects) {
        return null;
    }
}
