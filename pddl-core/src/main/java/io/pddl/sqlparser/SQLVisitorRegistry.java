package io.pddl.sqlparser;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.druid.sql.visitor.SQLASTOutputVisitor;

import io.pddl.datasource.DatabaseType;
import io.pddl.exception.DatabaseTypeUnsupportedException;
import io.pddl.sqlparser.visitor.PGSQLDeleteVisitor;
import io.pddl.sqlparser.visitor.PGSQLInsertVisitor;
import io.pddl.sqlparser.visitor.PGSQLSelectVisitor;
import io.pddl.sqlparser.visitor.PGSQLUpdateVisitor;

public final class SQLVisitorRegistry {
    
    private static final Map<DatabaseType, Class<? extends SQLASTOutputVisitor>> SELECT_REGISTRY = new HashMap<DatabaseType, Class<? extends SQLASTOutputVisitor>>(DatabaseType.values().length);
    
    private static final Map<DatabaseType, Class<? extends SQLASTOutputVisitor>> INSERT_REGISTRY = new HashMap<DatabaseType, Class<? extends SQLASTOutputVisitor>>(DatabaseType.values().length);
    
    private static final Map<DatabaseType, Class<? extends SQLASTOutputVisitor>> UPDATE_REGISTRY = new HashMap<DatabaseType, Class<? extends SQLASTOutputVisitor>>(DatabaseType.values().length);
    
    private static final Map<DatabaseType, Class<? extends SQLASTOutputVisitor>> DELETE_REGISTRY = new HashMap<DatabaseType, Class<? extends SQLASTOutputVisitor>>(DatabaseType.values().length);
    
    static {
        registerSelectVistor();
        registerInsertVistor();
        registerUpdateVistor();
        registerDeleteVistor();
    }
    
    private static void registerSelectVistor() {
        //SELECT_REGISTRY.put(DatabaseType.MySQL, MySQLSelectVisitor.class);
        // TODO 其他数据库
        SELECT_REGISTRY.put(DatabaseType.PostgreSQL, PGSQLSelectVisitor.class);
    }
    
    private static void registerInsertVistor() {
        
        //INSERT_REGISTRY.put(DatabaseType.MySQL, MySQLInsertVisitor.class);
    	INSERT_REGISTRY.put(DatabaseType.PostgreSQL, PGSQLInsertVisitor.class);
        // TODO 其他数据库
    }
    
    private static void registerUpdateVistor() {
      
        //UPDATE_REGISTRY.put(DatabaseType.MySQL, MySQLUpdateVisitor.class);
        // TODO 其他数据库
    	UPDATE_REGISTRY.put(DatabaseType.PostgreSQL, PGSQLUpdateVisitor.class);
    }
    
    private static void registerDeleteVistor() {
        
        //DELETE_REGISTRY.put(DatabaseType.MySQL, MySQLDeleteVisitor.class);
        // TODO 其他数据库
    	DELETE_REGISTRY.put(DatabaseType.PostgreSQL, PGSQLDeleteVisitor.class);

    }
    
    /**
     * 获取SELECT访问器.
     * 
     * @param databaseType 数据库类型
     * @return SELECT访问器
     */
    public static Class<? extends SQLASTOutputVisitor> getSelectVistor(final DatabaseType databaseType) {
        return getVistor(databaseType, SELECT_REGISTRY);
    }
    
    /**
     * 获取INSERT访问器.
     * 
     * @param databaseType 数据库类型
     * @return INSERT访问器
     */
    public static Class<? extends SQLASTOutputVisitor> getInsertVistor(final DatabaseType databaseType) {
        return getVistor(databaseType, INSERT_REGISTRY);
    }
    
    /**
     * 获取UPDATE访问器.
     * 
     * @param databaseType 数据库类型
     * @return UPDATE访问器
     */
    public static Class<? extends SQLASTOutputVisitor> getUpdateVistor(final DatabaseType databaseType) {
        return getVistor(databaseType, UPDATE_REGISTRY);
    }
    
    /**
     * 获取DELETE访问器.
     * 
     * @param databaseType 数据库类型
     * @return DELETE访问器
     */
    public static Class<? extends SQLASTOutputVisitor> getDeleteVistor(final DatabaseType databaseType) {
        return getVistor(databaseType, DELETE_REGISTRY);
    }
    
    private static Class<? extends SQLASTOutputVisitor> getVistor(final DatabaseType databaseType, final Map<DatabaseType, Class<? extends SQLASTOutputVisitor>> registry) {
        if (!registry.containsKey(databaseType)) {
            throw new DatabaseTypeUnsupportedException(databaseType.name()); 
        }
        return registry.get(databaseType);
    }
}
