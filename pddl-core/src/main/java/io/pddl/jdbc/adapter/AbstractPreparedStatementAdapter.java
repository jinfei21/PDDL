package io.pddl.jdbc.adapter;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.Ref;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import io.pddl.jdbc.ShardingConnection;
import io.pddl.jdbc.unsupported.AbstractUnsupportedOperationPreparedStatement;

public abstract class AbstractPreparedStatementAdapter extends AbstractUnsupportedOperationPreparedStatement {
    
    protected List<Object> parameters = new ArrayList<Object>();
    
    protected AbstractPreparedStatementAdapter(final ShardingConnection shardingConnection, final int resultSetType, final int resultSetConcurrency, final int resultSetHoldability) {
        super(shardingConnection, resultSetType, resultSetConcurrency, resultSetHoldability);
    }
    
    @Override
    public final void setNull(final int parameterIndex, final int sqlType) throws SQLException {
        setParameter(parameterIndex, null);
    }
    
    @Override
    public final void setNull(final int parameterIndex, final int sqlType, final String typeName) throws SQLException {
        setParameter(parameterIndex, null);
    }
    
    @Override
    public final void setBoolean(final int parameterIndex, final boolean x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setByte(final int parameterIndex, final byte x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setShort(final int parameterIndex, final short x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setInt(final int parameterIndex, final int x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setLong(final int parameterIndex, final long x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setFloat(final int parameterIndex, final float x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setDouble(final int parameterIndex, final double x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setString(final int parameterIndex, final String x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setBigDecimal(final int parameterIndex, final BigDecimal x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setDate(final int parameterIndex, final Date x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setDate(final int parameterIndex, final Date x, final Calendar cal) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setTime(final int parameterIndex, final Time x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setTime(final int parameterIndex, final Time x, final Calendar cal) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setTimestamp(final int parameterIndex, final Timestamp x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setTimestamp(final int parameterIndex, final Timestamp x, final Calendar cal) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setBytes(final int parameterIndex, final byte[] x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setBlob(final int parameterIndex, final Blob x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setBlob(final int parameterIndex, final InputStream x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setBlob(final int parameterIndex, final InputStream x, final long length) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setClob(final int parameterIndex, final Clob x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setClob(final int parameterIndex, final Reader x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setClob(final int parameterIndex, final Reader x, final long length) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setAsciiStream(final int parameterIndex, final InputStream x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setAsciiStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setAsciiStream(final int parameterIndex, final InputStream x, final long length) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setUnicodeStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setBinaryStream(final int parameterIndex, final InputStream x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setBinaryStream(final int parameterIndex, final InputStream x, final int length) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setBinaryStream(final int parameterIndex, final InputStream x, final long length) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setCharacterStream(final int parameterIndex, final Reader x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setCharacterStream(final int parameterIndex, final Reader x, final int length) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setCharacterStream(final int parameterIndex, final Reader x, final long length) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setURL(final int parameterIndex, final URL x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setSQLXML(final int parameterIndex, final SQLXML x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setRef(final int parameterIndex, final Ref x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setObject(final int parameterIndex, final Object x) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setObject(final int parameterIndex, final Object x, final int targetSqlType) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void setObject(final int parameterIndex, final Object x, final int targetSqlType, final int scaleOrLength) throws SQLException {
        setParameter(parameterIndex, x);
    }
    
    @Override
    public final void clearParameters() throws SQLException {
        parameters.clear();
    }
    
    private void setParameter(final int index, final Object x) {
        int extendedSize = index - parameters.size();
        if (extendedSize > 1) {
            while (--extendedSize > 0) {
                parameters.add(null);
            }
        }
        parameters.add(index - 1, x);
    }
}
