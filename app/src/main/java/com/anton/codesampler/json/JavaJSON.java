package com.anton.codesampler.json;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anton.codesampler.json.gson.GoogleGson;
import com.anton.codesampler.json.jsonsimple.JSONSimple;
import com.anton.codesampler.json.jackson.Jackson;

/**
 * Created by rem0tec0de on 26.11.16.
 */
public class JavaJSON extends ListActivity {
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
                "Jackson",
                "Google Gson",
                "JSON simple"
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
                Intent intent = new Intent(this, Jackson.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, GoogleGson.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, JSONSimple.class);
                startActivity(intent2);
                break;
        }
    }
}
