package easyquery;

import com.easy.query.core.abstraction.EasyQueryRuntimeContext;
import com.easy.query.core.api.client.DefaultEasyQuery;
import com.easy.query.core.api.client.EasyQuery;
import com.easy.query.core.api.pagination.EasyPageResult;
import com.easy.query.core.bootstrapper.EasyQueryBootstrapper;
import com.easy.query.core.logging.LogFactory;
import com.mybatisflex.core.MybatisFlexBootstrap;
import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import commons.DataSourceFactory;
import easyquery.entity.EasyQueryAccount;
import flex.entity.FlexAccount;
import flex.mapper.FlexAccountMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import plus.entity.PlusAccount;

import javax.sql.DataSource;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static flex.entity.table.Tables.FLEX_ACCOUNT;

public class EasyQueryInitializer {

    private static EasyQuery easyQuery;

    public static void init() {
        DataSource dataSource = DataSourceFactory.getDataSource();
         easyQuery = EasyQueryBootstrapper.defaultBuilderConfiguration().setDataSource(dataSource)
                .build();

//        AuditManager.setAuditEnable(true);
//        AuditManager.setMessageCollector(new ConsoleMessageCollector());

    }


    public static EasyQueryAccount selectOne() {
        return easyQuery.queryable(EasyQueryAccount.class)
                .where(o->o.ge(EasyQueryAccount::getId,100)
                        .or()
                        .eq(EasyQueryAccount::getUserName,"admin" + ThreadLocalRandom.current().nextInt(10000)))
                .firstOrNull();
    }


    public static List<EasyQueryAccount> selectTop10() {
        return easyQuery.queryable(EasyQueryAccount.class)
                .where(o->o.ge(EasyQueryAccount::getId,100)
                        .or()
                        .eq(EasyQueryAccount::getUserName,"admin" + ThreadLocalRandom.current().nextInt(10000)))
                .limit(10).toList();
    }
    public static List<EasyQueryAccount> selectTop10000() {
        return easyQuery.queryable(EasyQueryAccount.class)
                .where(o->o.ge(EasyQueryAccount::getId,100)
                        .or()
                        .eq(EasyQueryAccount::getUserName,"admin" + ThreadLocalRandom.current().nextInt(10000)))
                .limit(10000).toList();
    }

    public static EasyPageResult<EasyQueryAccount> paginate(int page, int pageSize) {

        return easyQuery.queryable(EasyQueryAccount.class)
                .where(o-> o.ge(EasyQueryAccount::getId,100))
                .toPageResult(page,pageSize,20000);
    }


    public static void update(String userName,String nickname) {

        easyQuery.updatable(EasyQueryAccount.class)
                .set(EasyQueryAccount::getUserName,userName)
                .set(EasyQueryAccount::getNickname,nickname)
                .where(o->o.ge(EasyQueryAccount::getId,9000).le(EasyQueryAccount::getId,9100)
                        .like(EasyQueryAccount::getUserName,"admin")
                        .like(EasyQueryAccount::getNickname,"admin"))
                .executeRows();
    }


}
