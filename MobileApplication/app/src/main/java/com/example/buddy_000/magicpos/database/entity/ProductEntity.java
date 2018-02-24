package com.example.buddy_000.magicpos.database.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.example.buddy_000.magicpos.model.Product;

@Entity(tableName = "product",
        indices = {@Index(value = "barcodeNo")
        })
public class ProductEntity implements Product {
    @PrimaryKey(autoGenerate = true)
    private int productId;
    private String name;
    private float rate;
    private int unit;
    private long barcodeNo;
    private String category;
    private float discount;
    private float maxRetailPrice;
    private String productSellerCompany;
    private int taxCategoryId;
    private long modificationTime;
    private long creationTime;

    @Override
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    @Override
    public long getBarcodeNo() {
        return barcodeNo;
    }

    public void setBarcodeNo(long barcodeNo) {
        this.barcodeNo = barcodeNo;
    }

    @Override
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    @Override
    public float getMaxRetailPrice() {
        return maxRetailPrice;
    }

    public void setMaxRetailPrice(float maxRetailPrice) {
        this.maxRetailPrice = maxRetailPrice;
    }

    @Override
    public String getProductSellerCompany() {
        return productSellerCompany;
    }

    public void setProductSellerCompany(String productSellerCompany) {
        this.productSellerCompany = productSellerCompany;
    }

    @Override
    public int getTaxCategoryId() {
        return taxCategoryId;
    }

    public void setTaxCategoryId(int taxCategoryId) {
        this.taxCategoryId = taxCategoryId;
    }

    @Override
    public long getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(long modificationTime) {
        this.modificationTime = modificationTime;
    }

    @Override
    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public ProductEntity() {
    }

    public ProductEntity( int productId, String name, float rate, int unit, long barcodeNo,
                          String category, float discount, float maxRetailPrice,
                          String productSellerCompany, int taxCategoryId ) {
        this.productId = productId;
        this.name = name;
        this.rate = rate;
        this.unit = unit;
        this.barcodeNo = barcodeNo;
        this.category = category;
        this.discount = discount;
        this.maxRetailPrice = maxRetailPrice;
        this.productSellerCompany = productSellerCompany;
        this.taxCategoryId = taxCategoryId;
        this.modificationTime = this.creationTime = System.currentTimeMillis();
    }
}
