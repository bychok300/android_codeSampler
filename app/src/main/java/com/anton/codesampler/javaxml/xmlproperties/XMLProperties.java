package com.anton.codesampler.javaxml.xmlproperties;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by rem0tec0de on 02.12.16.
 */
public class XMLProperties extends ListActivity{
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
                "Convert properties file into XML file",
                "Convert XML file into properties file"
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
        //работаем по позиции, при 0-вой позиции переходим в DOM XML Parser etc
        switch (position) {
            case 0:
                Intent intent = new Intent(this, ConvertPropertiesFileIntoXMLFile.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, ConvertXMLFileIntoPropertiesFile.class);
                startActivity(intent1);
                break;

        }
    }
}
