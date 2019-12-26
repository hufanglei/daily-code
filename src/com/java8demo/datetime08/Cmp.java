package com.java8demo.datetime08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Cmp {
    static String change = "E:/cmp/change";
    static String local = "E:/cmp/local";
    static String svn = "E:/cmp/svn";
    static int changeLen = 0;
    public static void main(String[] args) throws Exception {
        compare(new File(local));
    }

    private static void compare(File file) throws Exception{
        String localFilePath = file.getAbsolutePath();
        System.out.println(localFilePath);
        String relativePath = localFilePath.substring(local.length());
        File svnFile = new File(svn,relativePath);
        File changeFile = new File(change,relativePath);
        if(file.isDirectory()){
            if(!svnFile.exists()){
                changeFile.mkdirs();
            }
            File[] childs = file.listFiles();
            if(childs != null){
                for(File child:childs){
                    compare(child);
                }
            }
        }else{
            if(!svnFile.exists()){
                copy(file, changeFile);
            }else{
                if(Math.abs(file.length() - svnFile.length()) > changeLen){
                    copy(file, changeFile);
                }
            }
        }
    }

    public static void createFolder(File src){
        String localFilePath = src.getAbsolutePath();
        String relativePath = localFilePath.substring(local.length());
        if(relativePath.length()>0 && relativePath.contains("/")){
            //注意这里的 /  有可能需要换成  \  机器差异
            relativePath = relativePath.substring(0,relativePath.lastIndexOf("/"));
            File folder = new File(change,relativePath);
            folder.mkdirs();
        }
    }

    public static void copy(File src,File dest) throws Exception{
        createFolder(src);

        FileInputStream in = new FileInputStream(src);
        byte[] buf = new byte[1024];
        FileOutputStream out = new FileOutputStream(dest);
        int len = 0;
        while((len = in.read()) > -1){
            out.write(buf,0,len);
        }
        out.flush();
        out.close();
        in.close();
    }
}