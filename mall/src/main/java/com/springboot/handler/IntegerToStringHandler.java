package com.springboot.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IntegerToStringHandler extends BaseTypeHandler <Integer[]>{

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int index, Integer[] integers, JdbcType jdbcType) throws SQLException {
        StringBuffer stringBuffer=new StringBuffer();
        for (Integer s:integers){
            stringBuffer.append(s).append(",");
        }
        String substring = stringBuffer.toString().substring(stringBuffer.length() - 1);
        preparedStatement.setString(index,substring);
    }

    @Override
    public Integer[] getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String hobbyString = resultSet.getString(s);
        String[] hobbyArray = hobbyString.split(",");
        String [] strings=hobbyArray;
        int index=0;
        for(String s1:hobbyArray) {
            strings[index++] = s1.substring(1, s1.length() - 1);
        }
        Integer[] integers = new Integer[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.parseInt(strings[i]);
        }
        return integers;
    }

    @Override
    public Integer[] getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String hobbyString = resultSet.getString(i);
        String[] hobbyArray = hobbyString.split(",");
        String [] strings=hobbyArray;
        int index=0;
        for(String s1:hobbyArray) {
            strings[index++] = s1.substring(1, s1.length() - 1);
        }
        Integer[] integers = new Integer[strings.length];
        for (int j = 0; j < strings.length; j++) {
            integers[j] = Integer.parseInt(strings[j]);
        }
        return integers;
    }

    @Override
    public Integer[] getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String hobbyString = callableStatement.getString(i);
        String[] hobbyArray = hobbyString.split(",");
        String [] strings=hobbyArray;
        int index=0;
        for(String s1:hobbyArray) {
            strings[index++] = s1.substring(1, s1.length() - 1);
        }
        Integer[] integers = new Integer[strings.length];
        for (int j = 0; j < strings.length; j++) {
            integers[j] = Integer.parseInt(strings[j]);
        }
        return integers;
    }
}
