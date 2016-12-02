package com.anton.codesampler.javaxml.sax;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anton.codesampler.javaxml.sax.ReadUTF8XMLFile;
import com.anton.codesampler.javaxml.sax.ReadXMLFileSAX;
import com.anton.codesampler.javaxml.sax.SAXErrorContentIsNotAllowed;
import com.anton.codesampler.javaxml.sax.SAXErrorInvalidByte1;

/**
 * Created by rem0tec0de on 02.12.16.
 */
public class SAXXMLParser extends ListActivity{
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
                "Read a XML file",
                "Read a UTF-8 XML file",
                "SAX Error – Invalid byte 1 of 1-byte UTF-8 sequence",
                "SAX Error – Content is not allowed in prolog"
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
                Intent intent = new Intent(this, ReadXMLFileSAX.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, ReadUTF8XMLFile.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, SAXErrorInvalidByte1.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, SAXErrorContentIsNotAllowed.class);
                startActivity(intent3);
                break;
        }
    }
}
