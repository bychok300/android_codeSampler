package com.anton.codesampler.json.jackson;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anton.codesampler.json.jackson.JacksonStreamingExample;
import com.anton.codesampler.json.jackson.JacksonTreeModelExample;
import com.anton.codesampler.json.jackson.MapAndJSON;
import com.anton.codesampler.json.jackson.ObjectAndJSON;
import com.anton.codesampler.json.jackson.PrettyPrintJSONOutputInJackso;

/**
 * Created by rem0tec0de on 03.12.16.
 */
public class Jackson extends ListActivity {
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
        final String[] File = new String[]{
                "Jackson data binding example – Object & JSON",
                "Jackson data binding example – Map & JSON",
                "Jackson Tree Model example",
                "Jackson Streaming example",
                "Pretty print JSON output in Jackson"
        };
        //создаем эклемпляр адаптера и пихаем в него наш список
        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, File);
        //говорим нашему списку Работай!
        setListAdapter(mAdapter);
    }

    /***
     * тут мы делаем обработчик которой при клике на элемент списка кидает нас на новое активити
     */
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        //работаем по позиции, при 0-вой позиции переходим в JavaIO etc
        switch (position) {
            case 0:
                Intent intent = new Intent(this, ObjectAndJSON.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, MapAndJSON.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, JacksonTreeModelExample.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, JacksonStreamingExample.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, PrettyPrintJSONOutputInJackso.class);
                startActivity(intent4);
                break;
        }
    }
}
