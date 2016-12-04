package com.anton.codesampler.JDBC.JDBCPreparedStatment;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by rem0tec0de on 04.12.16.
 */
public class PreparedStatement extends ListActivity{
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
                "JDBC PreparedStatement example – Create a table",
                "JDBC PreparedStatement example – Insert a record",
                "JDBC PreparedStatement example – Update a record",
                "JDBC PreparedStatement example – Delete a record",
                "JDBC PreparedStatement example – Select list of the records",
                "JDBC PreparedStatement example – Batch Update"
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
                Intent intent = new Intent(this, PSSTMNCreateTable.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, PSSTMNInsertRecord.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, PSSTMNUpdateRecord.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, PSSTMNDeleteRecord.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, PSSTMNSelectListRecords.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, PSSTMNBatchUpdate.class);
                startActivity(intent5);
                break;
        }
    }
}
