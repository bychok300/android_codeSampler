package com.anton.codesampler.JDBC;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import com.anton.codesampler.JDBC.FAQ.FAQ;
import com.anton.codesampler.JDBC.JDBCPreparedStatment.PreparedStatement;
import com.anton.codesampler.JDBC.JDBCStoredProcedure.StoredProcedure;
import com.anton.codesampler.JDBC.QuickStart.QuickStart;
import com.anton.codesampler.JDBC.JDBCStatement.Statement;
import com.anton.codesampler.JDBC.TransactionExample.TransactionExample;

/**
 * Created by rem0tec0de on 26.11.16.
 */
public class JDBC extends ListActivity {
    /***
     * создаем список
     * <p>
     * с начала создаем адаптер
     */
    private ArrayAdapter<String> mAdapter;

    //тут у нас стандартный вызов
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //тут мы создаем элементы списка
        final String[] Javacore = new String[]{
                "Quick Start",
                "JDBC & Statement",
                "JDBC & PreparedStatement",
                "JDBC & Stored Procedure",
                "JDBC Transaction example",
                "FAQ"
        };
        //создаем эклемпляр адаптера и пихаем в него наш список
        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, Javacore);
        //говорим нашему списку Работай!
        setListAdapter(mAdapter);
    }

    /***
     *
     * тут мы делаем обработчик которой при клике на элемент списка кидает нас на новое активити
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //работаем по позиции, при 0-вой позиции переходим в JavaIO etc
        switch (position) {
            case 0:
                Intent intent = new Intent(this, QuickStart.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, Statement.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, PreparedStatement.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, StoredProcedure.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, TransactionExample.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent6 = new Intent(this, FAQ.class);
                startActivity(intent6);
                break;

        }
    }

}

