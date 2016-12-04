package com.anton.codesampler.JDBC.JDBCStatement;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by rem0tec0de on 04.12.16.
 */
public class Statement extends ListActivity{
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
        final String[] JDBCstatement = new String[]{
                "JDBC Statement example – Create a table",
                "JDBC Statement example – Insert a record",
                "JDBC Statement example – Update a record",
                "JDBC Statement example – Delete a record",
                "JDBC Statement example – Select list of the records",
                "JDBC Statement example – Batch Update"
        };
        //создаем эклемпляр адаптера и пихаем в него наш список
        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, JDBCstatement);
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
                Intent intent = new Intent(this, STMNCreateTable.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, STMNInsertRecord.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, STMNUpdateRecord.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, STMNDeleteRecord.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, STMNSelectListRecords.class);
                startActivity(intent4);
                break;
            case 5:
                Intent intent5 = new Intent(this, STMNBatchUpdate.class);
                startActivity(intent5);
                break;
        }
    }
}
