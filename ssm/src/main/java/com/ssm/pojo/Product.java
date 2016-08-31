package com.ssm.pojo;


public class Product {
    private String productcode;

    private Integer id;

    private String productname;

    private String appminversion;

    private String isonline;

    private String isallarea;

    private String priority;

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getAppminversion() {
        return appminversion;
    }

    public void setAppminversion(String appminversion) {
        this.appminversion = appminversion == null ? null : appminversion.trim();
    }

    public String getIsonline() {
        return isonline;
    }

    public void setIsonline(String isonline) {
        this.isonline = isonline == null ? null : isonline.trim();
    }

    public String getIsallarea() {
        return isallarea;
    }

    public void setIsallarea(String isallarea) {
        this.isallarea = isallarea == null ? null : isallarea.trim();
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }
}