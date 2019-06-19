package cn.itcast;

import java.sql.Date;
import java.sql.Timestamp;

public class Product {

    private String id;
    private String productnum;
    private String productname;
    private String cityname;
    private Date departuretime;
    private Double productprice;
    private String productdesc;
    private Integer productstatus;

    public Product() {
    }

    public Product(String id, String productnum, String productname, String cityname, Date departuretime, Double productprice, String productdesc, Integer productstatus) {
        this.id = id;
        this.productnum = productnum;
        this.productname = productname;
        this.cityname = cityname;
        this.departuretime = departuretime;
        this.productprice = productprice;
        this.productdesc = productdesc;
        this.productstatus = productstatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductnum() {
        return productnum;
    }

    public void setProductnum(String productnum) {
        this.productnum = productnum;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public Double getProductprice() {
        return productprice;
    }

    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    public Integer getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productnum='" + productnum + '\'' +
                ", productname='" + productname + '\'' +
                ", cityname='" + cityname + '\'' +
                ", departuretime=" + departuretime +
                ", productprice=" + productprice +
                ", productdesc='" + productdesc + '\'' +
                ", productstatus=" + productstatus +
                '}';
    }
}
