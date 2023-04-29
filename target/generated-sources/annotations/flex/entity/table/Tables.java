package flex.entity.table;

import com.mybatisflex.core.query.QueryColumn;
import com.mybatisflex.core.table.TableDef;

// Auto generate by mybatis-flex, do not modify it.
public class Tables {


    public static final FlexAccountTableDef FLEX_ACCOUNT = new FlexAccountTableDef("tb_account");

    public static class FlexAccountTableDef extends TableDef {

        public QueryColumn ID = new QueryColumn(this, "id");
        public QueryColumn USER_NAME = new QueryColumn(this, "user_name");
        public QueryColumn PASSWORD = new QueryColumn(this, "password");
        public QueryColumn SALT = new QueryColumn(this, "salt");
        public QueryColumn NICKNAME = new QueryColumn(this, "nickname");
        public QueryColumn EMAIL = new QueryColumn(this, "email");
        public QueryColumn MOBILE = new QueryColumn(this, "mobile");
        public QueryColumn AVATAR = new QueryColumn(this, "avatar");
        public QueryColumn TYPE = new QueryColumn(this, "type");
        public QueryColumn STATUS = new QueryColumn(this, "status");
        public QueryColumn CREATED = new QueryColumn(this, "created");

        public QueryColumn[] DEFAULT_COLUMNS = new QueryColumn[]{ID, USER_NAME, PASSWORD, SALT, NICKNAME, EMAIL, MOBILE, AVATAR, TYPE, STATUS, CREATED};
        public QueryColumn[] ALL_COLUMNS = new QueryColumn[]{ID, USER_NAME, PASSWORD, SALT, NICKNAME, EMAIL, MOBILE, AVATAR, TYPE, STATUS, CREATED};


        public FlexAccountTableDef(String tableName) {
            super(tableName);
        }
    }
}
