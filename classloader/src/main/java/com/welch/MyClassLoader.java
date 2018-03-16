package com.welch;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2018-3-15.
 */
public class MyClassLoader extends ClassLoader{

    private String path;

    public MyClassLoader(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException{
        String fileName = this.getFileName(name);
        File file = new File(path, fileName);
        try{
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int len;
            while((len=fis.read())!=-1){
                bos.write(len);
            }
            byte[] data = bos.toByteArray();
            fis.close();
            bos.close();
            return defineClass(name, data, 0, data.length);
        }catch(IOException e){
            e.printStackTrace();
        }
        return super.findClass(name);
    }

    private String getFileName(String name) {
        // TODO Auto-generated method stub
        int index = name.lastIndexOf('.');
        if(index == -1){
            return name+".class";
        }else{
            return name.substring(index+1)+".class";
        }
    }
}
