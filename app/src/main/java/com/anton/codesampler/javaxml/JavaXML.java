package com.anton.codesampler.javaxml;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.anton.codesampler.javaxml.jaxb.JAXBExample;
import com.anton.codesampler.javaxml.jdom.JDOMXMLParser;
import com.anton.codesampler.javaxml.xmlproperties.XMLProperties;
import com.anton.codesampler.javaxml.dom.DOMXMLParser;
import com.anton.codesampler.javaxml.sax.SAXXMLParser;

/**
 * Created by rem0tec0de on 26.11.16.
 */
public class JavaXML extends ListActivity {

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
                "DOM XML Parser",
                "SAX XML Parser",
                "JDOM XML Parser",
                "JAXB Example",
                "XML & Properties"
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
                Intent intent = new Intent(this, DOMXMLParser.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(this, SAXXMLParser.class);
                startActivity(intent1);
                break;
            case 2:
                Intent intent2 = new Intent(this, JDOMXMLParser.class);
                startActivity(intent2);
                break;
            case 3:
                Intent intent3 = new Intent(this, JAXBExample.class);
                startActivity(intent3);
                break;
            case 4:
                Intent intent4 = new Intent(this, XMLProperties.class);
                startActivity(intent4);
                break;


        }
    }
}
