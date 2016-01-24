package com.gr.jiang.project.po;

import java.io.Serializable;

/**
 * Created by jiang on 16/1/18.
 */
public class FilePo implements Serializable{
    private byte[] image ;
    private String imageName;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
