package com.huanyu.http;
import java.awt.Frame;

import java.awt.Graphics;

import java.awt.Image;

import java.awt.Toolkit;

import java.net.MalformedURLException;

import java.net.URL;

public class imageshow extends Frame{



    Image   myImage;

    String  sMsg;

    boolean loadFinished;

    public static void main(String[] av) {

        imageshow r = new imageshow( );

        r.setVisible(true);

        r.loadLoaclImage("D:\\Program Files\\IntelliJ IDEA 2023.2\\project\\HTTPSimg56eb7781-e0b4-45c5-b4cf-33435b4f6a08.jpg");

    }



    /** Construct the object */

    public imageshow() {

        super();

        sMsg = "Loading...";

        setSize(240, 160);

    }



    //加载网络上图片

    public void loadURLImage(String sUrl){

        Toolkit toolkit;

        loadFinished = false;

        toolkit      = Toolkit.getDefaultToolkit();

        try {

            URL url = new URL(sUrl);

            myImage = toolkit.getImage(url);

        } catch (MalformedURLException e) {

            e.printStackTrace();

        }

        Graphics g = this.getGraphics();

        g.drawImage(myImage, 6, 36, this);

    }



    //加载本地图片

    public void loadLoaclImage(String sFile){

        Toolkit toolkit;

        loadFinished = false;

        toolkit    = Toolkit.getDefaultToolkit();

        myImage    = toolkit.getImage(sFile);

        Graphics g = this.getGraphics();

        g.drawImage(myImage, 6, 36, this);

    }



    public void paint(Graphics g) {

        //判断是否加载完成

        if ( loadFinished == true ){

            g.drawImage(myImage, 6, 36, this);

        }else{

            g.drawString(sMsg, 100, 100);

        }

    }



    //图片加载状态通知函数

    public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {

        if ( infoflags == ALLBITS ) {

            loadFinished = true;

            repaint();

            return false;

        } else

        {

            return true;

        }

    }

}

